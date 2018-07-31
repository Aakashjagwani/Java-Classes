package com.example.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;
import com.example.repository.StudentRepository;


@Repository
public class StudentRepositoryImpl{
	
	@Autowired
	SessionFactory factory;
	
	public List<Student> getAllStudent(){
		List<Student> studentList = new ArrayList<Student>();
		studentList = factory.getCurrentSession().createQuery("from Student").list();
		return studentList;		
	}
	
	public void save(Student student){
		factory.getCurrentSession().saveOrUpdate(student);
		
	}
	
	public Student getStudent(long id){
		/*Student  student = (Student) factory.getCurrentSession().get(Student.class, id);
		System.out.println(student);*/
		Criteria criteria = factory.getCurrentSession().createCriteria(Student.class);
		criteria.add(Restrictions.eq("id",id)).setFetchMode("courseList", FetchMode.JOIN).setFetchMode("skill", FetchMode.JOIN);
		List<Student> students = criteria.list();
		Student student = students.get(0);
		return student;
	}
	
	public void deleteStudent(long id) {		
		Student student = getStudent(id);
		System.out.println(student);
		factory.getCurrentSession().delete(student);		
	}
	
	public List<Student> search(Student student) {
		Example studentExample = Example.create(student);
		List<Student> studentList = factory.getCurrentSession()
				.createCriteria(Student.class).add(studentExample).list();
		return studentList;
	}

}

