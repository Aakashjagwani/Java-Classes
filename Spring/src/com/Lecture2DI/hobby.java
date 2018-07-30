package com.Lecture2DI;

public class hobby {
	private String music;
	private String sports;
	private String surfing;
	
	
	public hobby(String s,String s1,String s2){	
		this.music = s;
		this.sports = s1;
		this.surfing = s2;
	}	
	void display(){
		System.out.println(music+sports+surfing);
	}
}
