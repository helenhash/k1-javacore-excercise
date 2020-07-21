package com.demo.core.lab5;

public interface ATM {
	boolean withdraw( int n1, double n2);
	boolean deposit(int n3 , double n4);
	double queryBalance(int n5);
	boolean login(String login, String logout);
	boolean logout(String signout);
}
