package com.demo.core.lab1;


public class Teacher {
	String name;
	int age;
	String subject;
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	public static void main(String[] args) {
		Teacher tec = new Teacher("Tam", "Mathematics");
		System.out.println("Teacher " + tec.name + " teaching " + tec.subject + " for Class 1");
	}
}
