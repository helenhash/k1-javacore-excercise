package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Customer customerObj = null;
	static List<Customer> listCustomers = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc 		= new Scanner(System.in);
		int n 			= 0;
		boolean flag 	= true;
		addCustomers();
		do {
			showMenu();
			n = sc.nextInt();
			sc.nextLine();
			switch (n) {
				case 1: addCustomer(); break;
				case 2:	showInfoCus(); break;
				case 3: findCustomer(); break;
				case 4: removeCustomer(); break;
				case 5:
				default:
					flag = false;
					break;
			}
		}while(flag == false);
		sc.close();
	}
//	Show menu
	public static void showMenu() {
		System.out.println("======================MANAGEMENT AT THE STATION======================");
		System.out.println("1.Add customer");
		System.out.println("2.Show information custemrs");
		System.out.println("3.Find customer");
		System.out.println("4.Remove customer");
		System.out.println("5.Exit");
		System.out.println("Please enter your choise [1-5]: ");
	}
	
// Add customers
	public static void addCustomers() {
		Customer customer1 = new Customer("ID1", "Peter", "Ha Noi", 10000);
		Customer customer2 = new Customer("ID2", "Mira", "Ha Noi", 10000);
		listCustomers.add(customer1);
		listCustomers.add(customer2);
	}
//	Add customer
	public static void addCustomer() {
//		 TODO Auto-generated method stub
		Scanner	sc = new Scanner(System.in);
		
		System.out.println("ID  :");
		String idCustomer	= sc.nextLine();
		System.out.println("Name : ");
		
		String nameCustomer	= sc.nextLine();
		System.out.println("Destination: ");
		String destination	= sc.nextLine();
		
		System.out.println("Price :");
		double price		= sc.nextDouble();
		sc.nextLine();
		sc.close();
		customerObj = new Customer(idCustomer, nameCustomer, destination, price);
				
		listCustomers.add(customerObj);
		System.out.print("The customer has been added!\n");
		
	}
//	Show information customer
	public static void showInfoCus() {
		System.out.println("----------Show information customer----------");
		for ( int i = 0 ; i < listCustomers.size() ; i++) {
			System.out.printf("\t Customer %d \n",i+1);
			System.out.println(listCustomers.get(i));
			System.out.println("----------------------------------------");
		}
	}
// Find the customer
	public static void findCustomer() {
		System.out.println("----------Find customer----------");
		String idCus = "";
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter ID need find : ");
		idCus = sc.nextLine();
		
		for ( int i = 0 ; i < listCustomers.size() ; i++) {
			if (listCustomers.get(i).getIdCustomer().equals(idCus)) {
				System.out.printf("\t Customer %d\n",i+1);
				System.out.println(listCustomers.get(i));
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		
		if (flag) {
			System.out.println("ID customer is not exist!");
		}
}
// 	Remove customer 
	public static void removeCustomer() {
		System.out.println("----------Remove customer----------");
		String idCus = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID customer need remove :");
		idCus = sc.nextLine();
		boolean flag = false;
		
		for(Customer x : listCustomers) {
			if(x.getIdCustomer().equals(idCus)) {
				listCustomers.remove(x);
				System.out.println("The customer has been moved!");
				flag = false;
				break;
			} else { flag = true;}
		}
		if(flag) {
			System.out.println("The customer is not exist!");
		}
	}
	


}
