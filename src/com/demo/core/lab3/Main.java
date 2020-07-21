package com.demo.core.lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleObj 	= null;
		Triangle triangleObj	= null; 
		
		Scanner sc 	= new Scanner(System.in);
		System.out.println("Enter leghth and width of rectangle: ");
		int length 	= sc.nextInt();
		int width	= sc.nextInt();
		
		System.out.println("Enter base and height of triangle:");
		int base 	= sc.nextInt();
		int height	= sc.nextInt();
		sc.close();
		
		rectangleObj = new Rectangle(length, width);
		triangleObj  = new Triangle(base, height);
		
		System.out.println(rectangleObj.toString());
		System.out.println(triangleObj.toString());
	}
}
