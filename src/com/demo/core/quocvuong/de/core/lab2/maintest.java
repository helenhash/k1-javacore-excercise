package com.de.core.lab2;

import java.util.Scanner;

public class maintest {
	public static void main(String[] args) {
		System.out.println("Input name :");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Input age :");
		int age = new Scanner(System.in).nextInt();
		System.out.println("Select job :");
		System.out.println("1:dev   2:QA    3:khac");
		int job ;
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAge(age);
		do {
			job = new Scanner(System.in).nextInt();
			if(job==1) {
				emp.setDepartment("development");
				emp.setJob("developer");
			}else if (job==2) {
				emp.setDepartment("QA");
				emp.setJob("QA");
			}else if (job==3) {
				emp.setDepartment("master");
				emp.setJob("master");
			}else {
				System.out.println("Nhập lại job:");
			}

		}while(job<0 || job >4);
		
		System.out.println("Tên nhân viên :" +emp.getName() +"\n"+"Tuổi :"+emp.getAge()+"\n"+"Nghề Nghiệp :"+emp.getJob()+"\n"+
				"Lương :" + emp.getSalary()+"\n"+"Phòng làm việc:" + emp.getDepartment());
		
	}
} 