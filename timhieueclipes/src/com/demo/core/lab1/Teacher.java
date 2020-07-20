package com.demo.core.lab1;

public class Teacher {
String name;
int id;
public Teacher(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
public Teacher(String name) {
	super();
	this.name = name;
}
public static void main(String[] args) {
	Teacher cogiao = new Teacher("lan", 10);
}
}
