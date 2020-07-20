package com.gl;

/**
 * Demo Instance Variables
 */
public class Employee {
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee (String empName) {
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void demoLocalVar(){
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String args[]) {
        //local var
        demoLocalVar();
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(DEPARTMENT);
    }
}
