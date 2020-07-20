package com.demo.core.lab5;

interface ATM {
	public boolean withdraw(int x, double y);
	public boolean deposit(int a, double b);
	public double queryBalance(int q);
	public boolean login(String user, String passw);
	public boolean logout(String lgout);
}

class ATMImpl implements ATM {
	int idATM;
	int accountId;
	

	@Override
	public boolean withdraw(int x, double y) {
		// TODO Auto-generated method stub
				
		return false;
	}

	@Override
	public boolean deposit(int a, double b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double queryBalance(int q) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(String user, String passw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout(String lgout) {
		// TODO Auto-generated method stub
		return false;
	}
}
