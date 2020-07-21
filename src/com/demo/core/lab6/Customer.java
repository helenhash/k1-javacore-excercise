package com.demo.core.lab6;

public class Customer {
	private String idCustomer;
	private	String nameCustomer;
	private String destination;
	private double price;
//	Constructor
	public Customer(String idCustomer, String nameCustomer, String destination, double price) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.destination = destination;
		this.price = price;
	}
//	Getter and Setter
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID \t\t: " + this.getIdCustomer() + "\n" + "Name \t\t: " + this.getNameCustomer() + "\n" + "Destination \t: " + this.getDestination() + "\n" + "Price \t\t: " + this.getPrice();
	}
	
}
