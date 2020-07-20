package com.hang.animal;

public abstract class Animal {

	private int soChan;
	private String mauSac;
	private int canNang;
	public Animal(int soChan, String mauSac, int canNang) {
		super();
		this.soChan = soChan;
		this.mauSac = mauSac;
		this.canNang = canNang;
	}
	
	public Animal() {
		super();
	}

	public int getSoChan() {
		return soChan;
	}

	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public int getCanNang() {
		return canNang;
	}

	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}
	
	public abstract void eat();
	
	
}
