package com.demo.core.lab2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
			Employee emp = new Employee();
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ten: ");
			emp.setName(sc.nextLine());
			System.out.println("nhap tuoi: ");					
			emp.setAge(sc.nextInt());
			sc = new Scanner(System.in);
			System.out.println("nhap job: ");		
			emp.setJob(sc.nextLine());
			System.out.println("salary: ");
			emp.setSalary(sc.nextDouble());
			sc = new Scanner(System.in);
			
			
			if(emp.getJob().equals("develop")) {
				emp.setDepartment("development");
			}
			else if(emp.getJob().equals("tester")) {
				emp.setDepartment("QA");
			}
			else {
				emp.setDepartment("master");
			}
//			List<Employee> emps = new ArrayList<Employee>();
//			emps.add(emp);
//			for(Employee e : emps) {
				System.out.println("name: " +emp.getName() + "\n" +"tuoi: " +emp.getAge()+"\n" 
		    +"job: " + emp.getJob()+"\n" +"salary: " +emp.getSalary()+"\n"+"department: "+ emp.getDepartment());
//			}
//		
			
		
//		
	}
}
