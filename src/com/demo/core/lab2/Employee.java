package com.demo.core.lab2;

import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String job;
	int salary;
	String department;
	
	
	public Employee(String name, int age, String job, int salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
		this.department = department;
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public static void main(String[] args){
		
		Scanner jobDemo = new Scanner(System.in);
		System.out.println("Nhap job: ");
		String job = jobDemo.nextLine();
		
		if(job.equals("developer")) {
			System.out.println("Department: development");
		}else if (job.equals("tester")) {
			System.out.println("Department: QA");
		}else{
			System.out.println("Department: master");
		}
		
	}
}
