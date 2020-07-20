package com.de.core.lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Input name :");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Input age :");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Input job :");
		String job = new Scanner(System.in).nextLine();

		job = job.toLowerCase();

		System.out.println("Input salary :");
		long salary = new Scanner(System.in).nextLong();

		Employee emp = new Employee();
		emp.setName(name);
		emp.setAge(age);
		emp.setJob(job);
		emp.setSalary(salary);

		if(emp.getJob().equals("developer")) {
			emp.setDepartment("development");
		}else if (emp.getJob().equals("tester")) {
			emp.setDepartment("QA");
		}else {
			emp.setDepartment("master");
		}

		System.out.println("Tên nhân viên :" +emp.getName() +"\n"+"Tuổi :"+emp.getAge()+"\n"+"Nghề Nghiệp :"+emp.getJob()+"\n"+
				"Lương :" + emp.getSalary()+"\n"+"Phòng làm việc:" + emp.getDepartment());



	}

}
