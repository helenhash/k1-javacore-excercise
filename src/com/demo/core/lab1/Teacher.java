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
	public static void main(String[] args) {
		
		System.out.println("Teacher Tam teaching Mathematics for Class 1");
	}
}
