package com.demo.core.lab6;

public class Customers {
	public String cmnd;
	public String name;
	public String gaden;
	public double giatien;

	public Customers(String cmnd, String name, String gaden, double giatien) {
		super();
		this.cmnd = cmnd;
		this.name = name;
		this.gaden = gaden;
		this.giatien = giatien;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}

	@Override
	public String toString() {
		return String.format("Customer cmnd %s - %s - gaden %s - Gia: %s", getCmnd(), getName(), getGaden(), getGiatien());
	}



} 