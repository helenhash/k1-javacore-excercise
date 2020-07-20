package com.demo.core.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class employee {
	String name;
	int age;
	String job;
	int salary;
	String department;
	public employee() {
		super();
	}

	public employee(String name, int age, String job, int salary, String department) {
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


	public static void main(String[] args) {
		employee e = new employee();
		Scanner a = new Scanner(System.in);
		System.out.println("nhập Tên");
		e.setName(a.nextLine());
		System.out.println("nhập tuổi");
		e.setAge(a.nextInt());
		Scanner b = new Scanner(System.in);
		System.out.println("nhập Công việc");
		e.setJob(b.nextLine());
		System.out.println("nhập Lương");
		e.setSalary(a.nextInt());
		String j = e.getJob();
		if(e.getJob().equals("developer")) {
			e.setDepartment("development");
			
		}
		else if (e.getJob().equals("tester")) {
			e.setDepartment("QA");
			
		}
		else {
			e.setDepartment("master");
			
		}
		System.out.println("Tên là: "+ e.getName() +"  tuổi: "
		+ e.getAge() +"  công việc: " + e.getJob() + "  lương:" + e.getSalary() + "  chức vụ: " + e.getDepartment());
		
		
	}

	}
