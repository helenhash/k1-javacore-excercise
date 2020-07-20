package com.demo.core.lab5;

public interface InterfaceATM {
	boolean withdraw(int a,double b);
	boolean deposit(int a,double b);
	double queryBlance(int a);
	boolean login(String a,String b);
	boolean logout(String a);
	
}
