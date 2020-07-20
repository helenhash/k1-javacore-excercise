package com.lab5;

public class User {
	private String soCMND ;
	private String name ;
	private String arrivals;
	private double price;
	
	
	public User() {
	}


	public User(String soCMND, String name, String arrivals, double price) {
		this.soCMND = soCMND;
		this.name = name;
		this.arrivals = arrivals;
		this.price = price;
	}


	public String getSoCMND() {
		return soCMND;
	}


	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getArrivals() {
		return arrivals;
	}


	public void setArrivals(String arrivals) {
		this.arrivals = arrivals;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
