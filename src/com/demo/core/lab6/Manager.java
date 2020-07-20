package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;


public class Manager {
	String CMND;
	String tenKH;
	String gaDen;
	double giaTien;
	public Manager(String cMND, String tenKH, String gaDen, double giaTien) {
		super();
		CMND = cMND;
		this.tenKH = tenKH;
		this.gaDen = gaDen;
		this.giaTien = giaTien;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	public static void main(String[] args){
	//them mot khach hang moi vao hang doi mua ve
		Manager customer1 = new Manager("193934204","Nguyen Van A","Hue", 250);
		List<Manager> customer = new ArrayList<>();
		customer.add(customer1);
	//hien thi cac khach hang dang xep hang mua ve 	
		for (Manager customers : customer){
            System.out.println(customer);
        }
		
	}
	
}
