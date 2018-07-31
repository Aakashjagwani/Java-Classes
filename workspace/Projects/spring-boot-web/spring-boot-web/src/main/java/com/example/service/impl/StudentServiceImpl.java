package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Email;
import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;


@Service
@Transactional(propagation=Propagation.SUPPORTS, readOnly=false)
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepositry;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public List<Student> getAllStudent(){
		return studentRepositry.findAll();
	}
	
	public void save(Student student){
		studentRepositry.save(student);
		System.out.println("Sending an email message.");
		jmsTemplate.convertAndSend("mailbox", new Email(student.getEmail(), "Registration Done successfully"));
	}
	
	public Student getStudent(long id) {
		return studentRepositry.findOne(id);
	}	

	public void deleteStudent(long id) {
		Student student = getStudent(id);
		studentRepositry.delete(id);	
		jmsTemplate.convertAndSend("mailbox", new Email(student.getEmail(), "Your information successfully deleted"));
	}
	
	public List<Student> search(Student student){
		return studentRepositry.findAll(Example.of(student));
	}

	@Override
	public List<Student> searchByField(String first, String email) {
		return studentRepositry.findByFirstNameOrEmail(first, email);
	}

}
