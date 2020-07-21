package com.demo.core.lab3;

public class Rectangle extends Shape {
	private int	length;
	private int	width;
//	Constructors
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
//	Getter and Setter
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
//	Abstract Shape
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getLength() * this.getWidth();
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle area is: " + this.getArea();
	}
	
}
