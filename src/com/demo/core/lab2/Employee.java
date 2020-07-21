package com.demo.core.lab2;

public class Employee {
	private String 	name;
	private int 	age;
	private String	job;
	private double	salary;
	private String department;
//	Constructor
	public Employee(String name, int age, String job, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
	}
//	Getter and setter
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
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "," + " Age: " + age +"," + " Job: " + job + "," +" salary " + ",";
	}
	
	
	
}
