package com.example.repository.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Course;
import com.example.repository1.CourseRepository;

@Repository
public class CourseRepositoryImpl {
	
	@Autowired
	SessionFactory factory;
		
	public List<Course> search(Course course) {
		Example courseExample = Example.create(course);
		List<Course> courseList = factory.getCurrentSession()
				.createCriteria(Course.class).add(courseExample).list();
		return courseList;
	}
	
	public Course save(Course course){
		long id = (Long) factory.getCurrentSession().save(course);
		Course course2 = (Course) factory.getCurrentSession().get(Course.class, id);
		return course2;
	}

}
