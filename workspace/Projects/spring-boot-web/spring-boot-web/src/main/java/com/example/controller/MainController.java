package com.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Course;
import com.example.model.FileUplaod;
import com.example.model.Skill;
import com.example.model.Student;
import com.example.model.dto.StudentDTO;
import com.example.service.StudentService;
import com.example.service1.CourseService;
import com.example.service1.SkillService;

/**
 * created date : 09/03/2017
 * 
 * @author JSoni StudentContoller class that will handle all the request and
 *         send response to the view It contains the methods for CRUD operation
 *
 */
@Controller
public class MainController {

	@Autowired
	StudentService studentService;// student service dependency

	@Autowired
	CourseService courseService;// course service dependency

	@Autowired
	SkillService SkillService;// skill service dependency
	
	@Autowired
	HttpServletResponse response;
	
	@Autowired
	HttpServletRequest request;

	boolean flag = false;
	
	final String dirpath = ".";
	
	private static String UPLOADED_FOLDER = "D://Project//";


	/**
	 * method that will redirect to the add-student.jsp
	 * 
	 * @param model
	 *            name of the model attribute
	 * @return to add-student.jsp page
	 */
	@RequestMapping(value = "addJsp")
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());
		return "add-student";
	}

	/**
	 * method that will fetch all the students from the database and send to
	 * view
	 * 
	 * @param model
	 *            name of the model attribute
	 * @return to the list.jsp that will display all student information
	 * @throws IOException 
	 */
	@RequestMapping(value = "showStudent")
	public String getAllStudents(Model model) throws IOException {
		List<Student> studentList = studentService.getAllStudent();
		model.addAttribute("STUDENT_LIST", studentList);
		wordFile();
		return "list";
	}

	/**
	 * method that will fetch all students information from the database and
	 * based on the PDFBuilder class generate the pdf file and render it to view
	 * 
	 * @return
	 */
	@RequestMapping(value = "download")
	public ModelAndView download() {
		List<Student> studentList = studentService.getAllStudent();
		return new ModelAndView("pdfView", "STUDENT_LIST", studentList);
	}

	/**
	 * method that will save the student first it will check the student object
	 * weather it is persisted or not if student object is in persisted state it
	 * will return the object and set the dependency if object is not in
	 * persisted state it will set the dependency and save the object into
	 * database with all associations
	 * 
	 * @param student
	 *            Student object
	 * @return to the list.jsp
	 * @throws IOException 
	 */
	@RequestMapping(value = "addStudent", method = RequestMethod.POST)
	public String saveOrupdate(HttpServletRequest request,
			@RequestParam(value = "file") MultipartFile file, @ModelAttribute("student") StudentDTO student) throws IOException {
				 

		System.out.println(student);
		String[] course = student.getCourse();
		String skill = student.getSkill();
		String name = student.getFirstName();
		String last = student.getLastName();
		String email = student.getEmail();
		Long id = student.getId();

		Student student2 = new Student();
		student2.setFirstName(name);
		student2.setLastName(last);
		student2.setEmail(email);
		student2.setId(id);

		Skill skill1 = new Skill();
		skill1.setSkill(skill);

		List<Skill> skillList = SkillService.search(skill1);

		if (skillList != null && skillList.size() > 0) {
			skill1 = skillList.get(0);
		} else {
			skill1 = SkillService.save(skill1);
		}

		List<Student> studentList = studentService.search(student2);

		if (studentList != null && studentList.size() > 0) {
			student2 = studentList.get(0);
		}

		List<Course> courses = new ArrayList<Course>();

		for (String course1 : course) {
			Course course2 = new Course();
			course2.setName(course1);

			List<Course> courseList = courseService.search(course2);
			if (courseList != null && courseList.size() > 0) {
				course2 = courseList.get(0);
			} else {
				course2 = courseService.save(course2);
			}
			courses.add(course2);
		}
		
		
		byte[] bytes = file.getBytes();
        Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
        Files.write(path, bytes);
        
        FileUplaod fileUplaod = new FileUplaod();
        fileUplaod.setFileName(file.getOriginalFilename());
        fileUplaod.setDestination(UPLOADED_FOLDER + file.getOriginalFilename());
        student2.setFileUplaod(fileUplaod);
		student2.setCourseList(courses);
		student2.setSkill(skill1);
		studentService.save(student2);
		return "redirect:showStudent";
	}

	/**
	 * method that will delete the student of given id from the database
	 * 
	 * @param studentId
	 *            id of the student
	 * @param model
	 *            name of the model
	 * @return to list.jsp
	 */
	@RequestMapping(value = "deleteStudent")
	public String deleteStudent(@RequestParam("studentId") String studentId, Model model) {
		long id = Long.parseLong(studentId);
		System.out.println(id);
		studentService.deleteStudent(id);
		return "redirect:showStudent";
	}

	/**
	 * method that will fetch the student of given id from the database and send
	 * it to view
	 * 
	 * @param studentId
	 *            id of student
	 * @param model
	 *            name of model
	 * @return to add-student.jsp
	 */
	@RequestMapping(value = "loadStudent", method = RequestMethod.GET)
	public String loadStudent(@RequestParam("studentId") String studentId, Model model) {
		long id = Long.parseLong(studentId);
		System.out.println(id);
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		return "add-student";
	}

	@RequestMapping(value = "search")
	public String search(@RequestParam("search") String search, Model model) {
		String first = "";
		String email = "";

		if (search.length() > 8) {
			email = search;
		} else {
			first = search;
		}

		model.addAttribute("STUDENT_LIST", studentService.searchByField(first, email));
		return "search";
	}

	/**
	 * default url for application if user is logged in it will redirect to
	 * list.jsp and if user is not logged in it will redirect to admin.jsp
	 * 
	 * @param model
	 *            name of the model
	 * @return to view
	 */
	@RequestMapping(value = "/")
	public String admin(Model model) {
		System.out.println("In admin");
		if (isRememberMeAuthenticated()) {
			System.out.println("In admin if condition");
			return "redirect:showStudent";
		} else if (flag) {
			flag = false;
			return "redirect:showStudent";
		} else {
			System.out.println("In admin else condition");
			model.addAttribute("STUDENT_LIST", studentService.getAllStudent());
			return "admin";
		}
	}

	/**
	 * method that will fetch the student with all association from the database
	 * and send to course.jsp
	 * 
	 * @param studentId
	 *            id of student
	 * @param model
	 *            name of model
	 * @return
	 */
	@RequestMapping(value = "course")
	public String course(@RequestParam("studentId") String studentId, Model model) {
		long id = Long.parseLong(studentId);
		Student student = studentService.getStudent(id);
		model.addAttribute("STUDENT", student);
		return "course";
	}

	/**
	 * render to login.jsp
	 * 
	 * @return
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		flag = true;
		System.out.println(flag);
		return model;
	}

	/**
	 * method the will check the user is login by "Remember Me Cookies"
	 * 
	 * @return
	 */
	private boolean isRememberMeAuthenticated() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(authentication);
		if (authentication == null) {
			return false;
		}
		return RememberMeAuthenticationToken.class.isAssignableFrom(authentication.getClass());
	}

	//@RequestMapping(value="/wordFile")
	public void wordFile() throws IOException {
		List<Student> studentList = studentService.getAllStudent();
		XWPFDocument document = new XWPFDocument();
		FileOutputStream out = new FileOutputStream(new File("document.docx"));
		XWPFParagraph paragraph = document.createParagraph();
		paragraph.setAlignment(ParagraphAlignment.CENTER);
		/*
		 * paragraph.setBorderBottom(Borders.BASIC_BLACK_DASHES);
		 * paragraph.setBorderLeft(Borders.BASIC_BLACK_DASHES);
		 * paragraph.setBorderRight(Borders.BASIC_BLACK_DASHES);
		 * paragraph.setBorderTop(Borders.BASIC_BLACK_DASHES);
		 */
		XWPFRun run = paragraph.createRun();
		run.setBold(true);
		run.setText("Student Information");
		XWPFTable table = document.createTable();		
		XWPFTableRow tableRowOne = table.getRow(0);
		tableRowOne.getCell(0).setText("Student Id");
		tableRowOne.addNewTableCell().setText("First Name");
		tableRowOne.addNewTableCell().setText("Last Name");
		tableRowOne.addNewTableCell().setText("Email");
		tableRowOne.addNewTableCell().setText("Skill");

		for (Student student : studentList) {
			XWPFTableRow tableRowTwo = table.createRow();
			tableRowTwo.getCell(0).setText(String.valueOf(student.getId()));
			tableRowTwo.getCell(1).setText(student.getFirstName());
			tableRowTwo.getCell(2).setText(student.getLastName());
			tableRowTwo.getCell(3).setText(student.getEmail());
			tableRowTwo.getCell(4).setText(student.getSkill().getSkill());			
		}

		document.write(out);
		System.out.println("File created successfully");
	}
	
	@RequestMapping(value = "exportWorld", produces = { "application/json; charset=UTF-8" }, method = RequestMethod.GET)
	public void exportErrorFile() {

		try {
			InputStream inputStream = new FileInputStream(dirpath
					+ "\\document.docx");
			byte[] out = IOUtils.toByteArray(inputStream);
			inputStream.close();
			response.setContentType("application/ms-word");
			
			response.addHeader("Content-disposition", "attachment; filename="
					+ "document" + ".docx");
			OutputStream outstrm = response.getOutputStream();
			outstrm.write(out);
			outstrm.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
