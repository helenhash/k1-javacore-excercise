package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
	
	static List<Customer> listKhachhangDoi = new ArrayList<>();
	
	public static void main(String[] args) {
		
		taolistkhachhang();
		
		hienthikhachhang();
		
		themkhachhang();
		
		hienthikhachhang();
		
		timkiemkhachhang();
		
		banve();
		
		hienthikhachhang();
	}

	private static void taolistkhachhang() {
		Customer cus1 = new Customer("1943534", "ngocanh", "hue", 150);
		Customer cus2 = new Customer("1946364", "nguyen minh", "hanoi", 550);
		Customer cus3 = new Customer("1963464", "van toan", "sai gon", 650);
		//them kh vao list
		listKhachhangDoi.add(cus1);
		listKhachhangDoi.add(cus2);
		listKhachhangDoi.add(cus3);
		
		}

	private static void hienthikhachhang() {
		System.out.println("---------------Danh sach khach hang doi mua ve-------------");
		for (Customer cus : listKhachhangDoi){
			System.out.println(cus.toString());
		}
		
	}
	private static void themkhachhang() {
		System.out.println("---------------Them mot khach hang vao hang doi------------");
		System.out.println("Nhap cmnd: ");
		Scanner nhap = new Scanner(System.in);
		String cmnd = nhap.nextLine();
		
		System.out.println("Nhap ten khach hang: ");
		String name = nhap.nextLine();
		
		System.out.println("Nhap ga den: ");
		String gaden = nhap.nextLine();
		
		System.out.println("Nhap gia: ");
		double giatien = nhap.nextDouble();
		
		Customer cusNhap = new Customer(cmnd, name, gaden, giatien);
		listKhachhangDoi.add(cusNhap);
		System.out.println("Da them thanh cong");
		
	}

	
	private static void timkiemkhachhang() {
		System.out.println("---------------Tim mot khach hang theo cmnd----------------");
		System.out.println("Nhap cmnd can tim: ");
		Scanner nhap = new Scanner(System.in);
		String cmnd = nhap.nextLine();
		Customer cmndCanTim = null;
		for (Customer cus : listKhachhangDoi){
			if (cus.getCmnd().equals(cmnd)){
				cmndCanTim = cus;
				break;
			}
		}
		if (cmndCanTim != null) {
			System.out.println(cmndCanTim.toString());
		}else{
			System.out.println("khong tim thay cmnd");
		}
	}
	
	private static void banve() {
		System.out.println("---------Ban ve---------");
		System.out.println("Nhap cmnd ban ve: ");
		Scanner nhap = new Scanner(System.in);
		String cmnd = nhap.nextLine();
		for (Customer cus : listKhachhangDoi){
			if (cus.getCmnd().equals(cmnd)){
				listKhachhangDoi.remove(cus);
				break;
			}
		}
		System.out.println("Da xoa khoi hang doi");
	}
}
