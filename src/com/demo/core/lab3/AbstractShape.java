package com.demo.core.lab3;

//tạo abstract class
abstract class AbstractShape {
	String color;
	int	soCanh;
	
	/**
	 * @param color
	 */
	public AbstractShape(String color) {
		super();
		this.color = color;
	}
	
	
	/**
	 * @param color
	 * @param soCanh
	 */
	public AbstractShape(String color, int soCanh) {
		super();
		this.color = color;
		this.soCanh = soCanh;
	}


	public abstract double getArea(); //abstract method
	public String toString() {
		return color + " " + soCanh;
	}
	
	
	
}

