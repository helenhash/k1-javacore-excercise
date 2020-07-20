package com.demo.core.lab3;

abstract class AbstractShape{
	String color;
	int soCanh;
	
	public AbstractShape(String color) {
		super();
		this.color = color;
	}
	public abstract double getArea(); //abstract method
	public String toString() {
		return color;
	}
};
