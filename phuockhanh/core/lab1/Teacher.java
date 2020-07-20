package com.demo.core.lab1;

public class Teacher {
	public String name;
	public int age;
	public String Subject;
	public Teacher(String name, int age, String Subject) {
		this.name=name;
		this.age=age;
		this.Subject=Subject;
	}
	public static void main(String[] args) {
		Teacher teacherinfo= new Teacher("Tam",25,"Mathematics");
		System.out.println("Teacher " +teacherinfo.name + " teaching " + teacherinfo.Subject + " for Class 1");
				
	}
	
}
