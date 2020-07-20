package com.demo.core.lab2;

public class Employee {
	private String name;
	private int age;
	private String job;
	private double salary;
	private String department;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String job, double salary, String department) {
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
