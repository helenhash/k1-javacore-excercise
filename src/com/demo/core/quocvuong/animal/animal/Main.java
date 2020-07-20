package com.hang.animal;

public class Main {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		dog.setCanNang(4);
		dog.setMauSac("gray");
		dog.setSoChan(4);
		dog.eat();
		Info.showInfo(dog);
		Animal cat = new Cat();
		cat.eat();
				
	}
}
