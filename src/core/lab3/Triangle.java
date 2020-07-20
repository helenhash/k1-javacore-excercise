package com.demo.core.lab3;

public class Triangle extends AbstractShape {
	int base;
	int height;
	/**
	 * @param color
	 * @param base
	 * @param height
	 */
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return 0.5 * base * height;
	}
	public String toString() {
		return color + " color " + base + "cm" + "x" + height + "cm";
	}
	 public static void main(String[] args) {
		Triangle trig_1 = new Triangle("blue", 15, 12);
		Triangle trig_2 = new Triangle("violet", 16, 25);
		
		System.out.println("The first triangle is " + trig_1);
		System.out.print("Area is " + trig_1.getArea() + "cm2" + "\n");
		System.out.println("The second one is " + trig_2);
		System.out.print("Area is " + trig_2.getArea() + "cm2");
	}
	
}
