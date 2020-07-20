package com.demo.core.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khi các fields của Obj. là public, có thể gọi everywhere, ở đây gán Obj. 
		//cụ thể và in ra info
		Teacher Tam = new Teacher("Tam",29,"Mathematics");
//		Subject Math = new Subject("Mathematics", "Class1")
		System.out.println("Our teacher today is Mr. " + Tam.nameTeacher + ", he's " + Tam.ageOfTeacher + ". He'll teach us " + Tam.subject + ".");
	
		Subject Math = new Subject("Mathematics", "Class1");
		System.out.println("Teacher " + Tam.nameTeacher + " is teaching " + Math.name + " in " + Math.classId);
	
		
		
	}
		
}
