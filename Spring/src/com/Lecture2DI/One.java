package com.Lecture2DI;

public class One {
	private int id;
	private String name;
	private hobby hobbies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public hobby getHobbies() {
		return hobbies;
	}
	public void setHobbies(hobby hobbies) {
		this.hobbies = hobbies;
	}
	
	public void show(){
		System.out.println(id+name);
	hobbies.display();
	}	
}
