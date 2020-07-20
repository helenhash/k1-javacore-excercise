package com.demo.core.lab5;

public interface ATM {
	boolean withdraw(int a, double b);
	boolean desposit(int c, double d);
	double queryBalance(int e);
	boolean login(String f, String g);
	boolean logout(String h);
}
