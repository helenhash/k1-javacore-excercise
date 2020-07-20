package com.demo.core.lab1;

public class Subject {
String name;
String classId;
public Subject(String name) {
	super();
	this.name = name;
}

public Subject(String name, String classId) {
	super();
	this.name = name;
	this.classId = classId;
}

public static void main(String[] args) {
	Teacher cogiao = new Teacher("nhung",2);
	Subject toan = new Subject("dai so","s1");
	Subject giaoduccongdan = new Subject("gdcd");
	System.out.println("Teacher Tam teaching Mathematics for Class 1");
}
}
