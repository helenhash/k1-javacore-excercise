package com.demo.core.lab3;

public abstract class Shape {
	private String color;

	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
	public abstract double getArea();
	
	@Override
	public String toString() {
		
		return this.color;
	}
}
