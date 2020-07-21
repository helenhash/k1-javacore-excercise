package com.demo.core.lab1;

public class Teacher {
	private String name;
	private int age;
	private String subject;
//	Constructors
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Teacher " + name + " teaching " + subject + " for Class 1";
	}
	
 
}
