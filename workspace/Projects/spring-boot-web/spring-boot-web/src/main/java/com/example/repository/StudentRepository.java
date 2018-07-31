package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByFirstNameOrEmail(String first, String email);
	
	/*public List<Student> getAllStudent();
	
	public void save(Student student);
	
	public Student getStudent(long id);
	
	public void deleteStudent(long id);
	
	public List<Student> search(Student student);*/
}
