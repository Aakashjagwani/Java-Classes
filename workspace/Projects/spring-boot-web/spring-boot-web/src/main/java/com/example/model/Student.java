package com.example.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/** * 
 * created date : 09/03/2017
 * @author JSoni
 * 
 * **/
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; // unique key 
	private String firstName; // first name of student
	private String lastName;//last name of student
	private String email;//email of student
		
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Skill skill;//skill of student 
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Course> courseList;//list of courses enroll by student by association
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private FileUplaod fileUplaod;
	
	public Student() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public FileUplaod getFileUplaod() {
		return fileUplaod;
	}

	public void setFileUplaod(FileUplaod fileUplaod) {
		this.fileUplaod = fileUplaod;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
