/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Tran Huu Tuan
 */
public class Console {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên nhân viên: ");
        String name=sc.nextLine();
      	System.out.print("Nhập công việc : ");
	String job = sc.nextLine();
	if(job.equals("developer")) {
               System.out.println("Department: development");
	}else if (job.equals("tester")) {
		System.out.println("Department: QA");
	}else{
		System.out.println("Department: master");
		
    }
}
}
