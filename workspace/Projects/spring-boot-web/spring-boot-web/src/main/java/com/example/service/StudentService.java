package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public void save(Student student);
	
	public Student getStudent(long id);
	
	public void deleteStudent(long id);
	
	public List<Student> search(Student student);
	
	public List<Student> searchByField(String first, String email);
}

