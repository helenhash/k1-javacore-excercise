package com.demo.core.lab3;

abstract class Shape {
	private String color;
	
	public Shape (String color){
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	   public String toString() {
	      return "Shape[color=" + color + "]";
	   }
	public double getArea() {
		return 0;
		
	}
}
