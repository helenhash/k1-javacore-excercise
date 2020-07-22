package com.demo.core.lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Employee {
	private String name;
	private int age;
	private String job;
	private double salary;
	private String department;
	


	
//constructor đầy đủ, dùng scanner để lấy input	
/**
	 * @param name
	 * @param age
	 * @param job
	 * @param salary
	 * @param department
	 */
	public Employee(String name, int age, String job, double salary, String department) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.salary = salary;
		this.department = department;
	}
	
	
//tạo constructor ko có fields nào để dùng get/set truyền giá trị sau đó
	/**
 * 
 */
	public Employee() {
		super();
	}


	//tạo getter+setter để truyền giá trị cho new Obj.
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public int getAge() {
		 return age;
	}
	public void setAge(int newAge) {
		this.age = newAge;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String newJob) {
		this.job = newJob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		this.salary = newSalary;
	}
	public String getDep() {
		return department;
	}
	public void setDep(String newDep) {
		this.department = newDep;
	}
	public static void main(String[] args) {
		
		//Dùng getter.setter truyền value cho fields.
		Employee nhi = new Employee();
		nhi.setName("Nhi Ngo");
		System.out.println("Employee's name is: " + nhi.getName()); 
		nhi.setAge(26);
		System.out.println("Age: " + nhi.getAge());
		nhi.setJob("Junior Dev");
		System.out.println("Job: " + nhi.getJob());
		nhi.setSalary(8500000);
		System.out.println("Salary: " + nhi.getSalary());
		nhi.setDep("Development");
		System.out.println("Department: " + nhi.getDep());
		
		//Dùng Scanner nhập input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------- \n");
		System.out.println("Please enter employee's info:");
		System.out.print("Name: ");
		
		String name = sc.nextLine(); //khai bao lai bien de access
		
		System.out.print("Age: ");
		int age = sc.nextInt();
		
		System.out.print("Job: ");
		String job = sc.next();
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Department: ");
		String department = sc.next();
		
		
		Employee vi = new Employee ("Võ Hoàng Vi", 26, "Junior Dev", 7000000,"Devevlopment");
		Employee ngân = new Employee ("Trần Thị Kiều Ngân", 26, "Junior Dev", 7000000, "Devevlopment");
		Employee vVA = new Employee ("Vũ Văn A", 31, "Tester", 15000000, "QA");
		Employee lựu = new Employee ("Nguyễn Thị Lựu", 29, "Senior Dev", 10000000, "Devevlopment");
		Employee bom = new Employee ("Huỳnh Viết Bom", 39, "Master", 20000000, "Management");
		
		//List of Employees, từ java.util
		List<Employee> nhiEmployess = new ArrayList<>();
		
		//Add vao list
		nhiEmployess.add(vi);
		nhiEmployess.add(ngân);
		nhiEmployess.add(vVA);
		nhiEmployess.add(lựu);
		nhiEmployess.add(bom);
		
		//In ra list
		System.out.println("Danh sách nhân viên:");
		for (Employee employee : nhiEmployess) {
			System.out.println(employee.name + " " + employee.age + " " + 
			employee.job + " " + employee.salary + " " + employee.department );
			
		}
		System.out.println("\n");
		System.out.println("Nhân viên bị sa thải: " + nhiEmployess.get(3).name);
		System.out.println("Nhân viên được thăng chức: " + nhiEmployess.get(1).name);
		
		//demo Map
		Map<String, String> myEmployeeMap = new HashMap<>();
		myEmployeeMap.put(vi.name, vi.job);
		myEmployeeMap.put(ngân.name, ngân.job);
		myEmployeeMap.put(vVA.name, vVA.job);
		myEmployeeMap.put(lựu.name, lựu.job);
		myEmployeeMap.put(bom.name, bom.job);
		
		System.out.println("This is my Map of Employees:");
		System.out.println(myEmployeeMap);
		
		
		


}
	
}
