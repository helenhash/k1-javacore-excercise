package com.demo.core.lab3;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "chieu dai: " + this.length +"\n" + "chieu rong: " +this.width 
				+"\n"+ "dien tich: " +getArea();
	}
	
}
