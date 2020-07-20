package com.demo.core.lab3;

public class Rectangle extends AbstractShape {
      int length;
      int width;
      public Rectangle(String color, int length, int width) {
  		super(color);
  		this.length = length;
  		this.width = width;
  	}
  	
  	
  	public double getArea() {
  		return width*length;
  }
  	public String toString() {
  		return " color: " + color+", "+"Lengh: "+ length + "cm" + ", " +"Width: "+ width + "cm";
  	}
  	public static void main(String[] args) {
  		Rectangle rectangle1 = new Rectangle("red", 20, 10);
  		
  		System.out.println("Rectangle: " + rectangle1);
  		System.out.print("Area: " + rectangle1.getArea() + "cm2");
  		
  	}
}
