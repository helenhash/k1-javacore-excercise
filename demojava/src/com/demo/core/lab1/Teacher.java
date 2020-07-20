package com.demo.core.lab1;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Teacher(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}