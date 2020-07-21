package com.demo.core.lab2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employeeObj = null;
		Scanner sc 	= new Scanner(System.in);
		
		System.out.println("Name :");
		String name = sc.nextLine();
		
		System.out.println("Age :");
		int age 	= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Job :");
		String job 	= sc.nextLine();
		
		System.out.println("Salary :");
		double salary = sc.nextDouble();
		
		sc.close();
		
		employeeObj = new Employee(name, age, job, salary);
		
		if (job.equals("developer")) {
			System.out.println(employeeObj.toString() + " Department : development.");
		} else {
			if ( job.equals("tester")) {
				System.out.println(employeeObj.toString() + " Department : tester.");
			}
			else {
				System.out.println(employeeObj.toString() + " Department : master.");
			}
		}
	}

}
