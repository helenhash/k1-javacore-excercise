package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoClass {
	
	static List<Customer> listKhachhangDoi = new ArrayList<>();
	
	public static void main(String[] args) {
		khoitaolistkhachhang();
		hienthikhachhang();
		
		themkhachhang();
		hienthikhachhang();
		
		timkhach();
		
		banve();
		
		hienthikhachhang();
	}
	
	private static void khoitaolistkhachhang() {
		Customer cusNhap = new Customer("2121", "giau", "hue", 10.1);
		Customer cusNhap1 = new Customer("1919191", "abc", "danang", 10.1);
		listKhachhangDoi.add(cusNhap1);
		listKhachhangDoi.add(cusNhap);
	}
	
	private static void hienthikhachhang(){
		System.out.println("============= DANH SACH KHACH DANG DOI MUA VE ===============");
		for (Customer cus : listKhachhangDoi) {
			System.out.println(String.format("Khach hang co cmnd %s - %s - den %s - Gia: %s",
					cus.getCmnd(), cus.getName(), cus.getGaden(), cus.getGiatien()));
		}
	}
	
	private static void themkhachhang() {
		System.out.println("============= THEM MOT KHACH HANG VAO HANG DOI=============");
		System.out.println("Nhap cmnd: ");
		Scanner scan0 = new Scanner(System.in);
		String cmnd = scan0.nextLine();
		
		System.out.println("Nhap ten: ");
		String name = scan0.nextLine();
		
		System.out.println("Nhap ga den: ");
		String gaden = scan0.nextLine();
		
		System.out.println("Nhap gia: ");
		double giatien = scan0.nextDouble();
		
		Customer cusNhap = new Customer(cmnd, name, gaden, giatien);
		listKhachhangDoi.add(cusNhap);
		System.out.println("Them thanh cong");
	}
	
	private static void timkhach(){
		System.out.println("============= TIM MOT KHACH HANG THEO CMND =============");
		System.out.println("Nhap cmnd can tim: ");
		Scanner scan0 = new Scanner(System.in);
		String cmnd = scan0.nextLine();
		Customer cmndTimthay = null;
		for (Customer cus : listKhachhangDoi) {
			if (cus.getCmnd().equals(cmnd)) {
				cmndTimthay = cus;
				break;
			}
		}
		if (cmndTimthay != null) {
			System.out.println(String.format("Khach hang co cmnd %s - %s - den %s - Gia: %s",
					cmndTimthay.getCmnd(), cmndTimthay.getName(), cmndTimthay.getGaden(), cmndTimthay.getGiatien()));
		}else {
			System.out.println("ko tim thay");
		}
	}
	
	private static void banve() {
		System.out.println("============= BAN VE =============");
		System.out.println("Nhap cmnd ban ve: ");
		Scanner scan0 = new Scanner(System.in);
		String cmnd = scan0.nextLine();
		for (Customer cus : listKhachhangDoi) {
			if (cus.getCmnd().equals(cmnd)) {
				listKhachhangDoi.remove(cus);
				break;
			}
		}
		System.out.println("Da xoa khoi hang doi: ");
	}
	
}
