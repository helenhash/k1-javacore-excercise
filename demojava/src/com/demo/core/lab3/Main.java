package com.demo.core.lab3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rectangle re = new Rectangle(10, 10);
		System.out.println(re.toString());
		
		System.out.println("==================");
		Triangle tr = new Triangle(10,5);
		System.out.println(tr.toString());
	}
}
