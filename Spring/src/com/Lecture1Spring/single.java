package com.Lecture1Spring;

public class single {
	private single(){}
	static single s=new single();
	public void m1()
		{
			System.out.println("Hii");
		}
	public static single getInstance()
	{
		return s;
	}	
}
