package com.demo.core.lab3;

public class Rectangle extends AbstractShape {
	int length;
	int width;
	
	
	
	/**
	 * @param color
	 * @param length
	 * @param width
	 */
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	
	public double getArea() {
		return width*length;
}
	public String toString() {
		return color + " color " + length + "cm" + "x" + width + "cm";
	}
	public static void main(String[] args) {
		Rectangle recg_1 = new Rectangle("red", 15, 12);
		Rectangle recg_2 = new Rectangle("yellow", 25, 16);
		
		System.out.println("The first rectangle is " + recg_1);
		System.out.print("Area is " + recg_1.getArea() + "cm2" + "\n");
		System.out.println("The second one is " + recg_2);
		System.out.print("Area is " + recg_2.getArea() + "cm2");
		
		
		
		
	}
	
}
	
	
