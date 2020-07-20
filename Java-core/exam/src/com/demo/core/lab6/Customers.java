package com.demo.core.lab6;
import java.util.Scanner;
public class Customers {
      int CMND;
      String Name;
      String GaDen;
      double GiaTien;
      public static void main(String[] arge){
    	  Scanner newCustomer = new Scanner(System.in);
    	  //System.out.println("Information new customer");
    	  System.out.println("CMND: ");
    	  int CMND = newCustomer.nextInt();
    	  
    	  System.out.println("Name: ");
    	  String Name = newCustomer.nextLine();
    	  
    	  System.out.println("Ga Đến: ");
    	  String GaDen = newCustomer.nextLine();
    	  
    	  System.out.println("Giá Tiền: ");
    	  double GiaTien = newCustomer.nextDouble();
    	  
    	 
    	  
    	
      }
}
