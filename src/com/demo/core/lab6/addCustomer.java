package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addCustomer {
	
	static List<Customers> CustomersWaiting = new ArrayList<>();

	public static void main(String[] args) {
		
		Customers custumer1 = new Customers("777777777", "TUAN ANH", "HCM", 7777);
		Customers customer2 = new Customers("888888888", "NGOC ANH", "HANOI", 888);
		Customers customer3 = new Customers("999999999", "SANH TRUNG", "HUE", 999);
		
		CustomersWaiting.add(custumer1);
		CustomersWaiting.add(customer2);
		CustomersWaiting.add(customer3);
  do{
	Scanner scanner = new Scanner(System.in);
	System.out.println("1: CUSTOMERS WAITING FOR BUY TICKET.");
    System.out.println("2: ADD A NEW CUSTOMER.");
    System.out.println("3: FINDING CUSTOMER BY IB CARDS.");
    System.out.println("4: DELETE CUSTOMER BOUGHT TICKET BY ID CARD");
    int a = scanner.nextInt();
    switch(a){
    case 1:
		for (Customers cus : CustomersWaiting){
			System.out.println(cus.toString());
		}break;
    case 2:
		System.out.println("ENTER ID CARDS: ");
		Scanner scanner1 = new Scanner(System.in);
		String cmnd = scanner1.nextLine();

		System.out.println("NAME: ");
		String name = scanner1.nextLine();

		System.out.println("ENTER TRAIN STATION ARRIVAL: ");
		String gaden = scanner1.nextLine();

		System.out.println("ENTER PRICE: ");
		double giatien = scanner1.nextDouble();

		Customers newcustomer = new Customers(cmnd, name, gaden, giatien);
		CustomersWaiting.add(newcustomer);
		System.out.println("ADDED SUCCESS!");
		break;

    case 3:
		
		System.out.println("ENTER ID CARDS NEED TO FIND: ");
		Scanner scanner2 = new Scanner(System.in);
		String customerID = scanner2.nextLine();
		Customers cmndneedtofind = null;
		for (Customers cus : CustomersWaiting){
			if (cus.getCmnd().equals(customerID)){
				cmndneedtofind = cus;
				break;
			}
		}
		if (cmndneedtofind != null) {
			System.out.println(cmndneedtofind.toString());
		}else{
			System.out.println("DO NOT FIND ID CARDS");
		}
		break;
    case 4:
		
		System.out.println("ENTER ID CARDS CUSTOMER BOUGHT TICKET: ");
		Scanner scanner3 = new Scanner(System.in);
		String deletecustomerID = scanner3.nextLine();
		for (Customers cus : CustomersWaiting){
			if (cus.getCmnd().equals(deletecustomerID)){
				CustomersWaiting.remove(cus);
				break;
			}
		}
		System.out.println("DELETED SUCCESS!");
	}
    break;
}while ('a'<5);
  }}
