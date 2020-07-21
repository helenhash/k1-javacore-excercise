package com.demo.core.lab3;

public class Triangle extends Shape{
	private int	base;
	private int height;
//	Constructors
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
//	Getter and Setter
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
//	Abstract Shape
	public double getArea() {
		return 0.5 * this.getBase() * this.getHeight();
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle area is: " + this.getArea();
	}
	
	
}
