package com.demo.core.lab3;

public class Triangle extends Shape{
	private int base;
	private int height;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return (base * height)/2;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "base: " +this.base + "\n"+"height: "+ this.height+"\n"+"dien tich: " +this.getArea(); 
	}
	
}
