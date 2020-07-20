package com.de.core.lab1;
 

public class Main {
	
	

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("vuong",18,"hoa");
		Subject subject1 = new Subject("toan",1);
		
		System.out.println("Teacher " + teacher1.name + " teaching "+ subject1.getName()+" for Class" + subject1.getClassId());
		
		
		
		// TODO Auto-generated method stub

	}

}
