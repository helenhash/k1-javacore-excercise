package com.hang.animal;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("My name is Dog. I eat rice");
		System.out.println("I have "+this.getSoChan()+ "chan");
	}

}
