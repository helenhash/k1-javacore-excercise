package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.SpringLayout.Constraints;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<NhagaDTO> list = new ArrayList<>();
		NhagaDTO dto = new NhagaDTO();
		NhagaDTO dto1 = new NhagaDTO("123a", "phat", "lao", 120);
		NhagaDTO dto2 = new NhagaDTO("124a", "bon", "thailan", 1200);
		NhagaDTO dto3 = new NhagaDTO("125a", "dsad", "uc", 1209);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		do {
			System.out.println("===============chon so============");
			System.out.println("1: them khach hang vao hang doi");
			System.out.println("2: hien thi cac khach hang dang xep hang");
			System.out.println("3: tim khach hang theo cmnd");
			System.out.println("4: xoa");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				sc = new Scanner(System.in);
				System.out.println("them cmnd: ");
				dto.setCMND(sc.nextLine());

				System.out.println("name: ");
				dto.setName(sc.nextLine());
				sc = new Scanner(System.in);
				System.out.println("gaden: ");
				dto.setGaden(sc.nextLine());
				System.out.println("giatien: ");
				dto.setGiatien(sc.nextDouble());

				if (list.add(dto)) {
					System.out.println("dax them");
				}
				break;

			case 2:
				// hien thi danh sach khach hang doi mua ve
				for (NhagaDTO ng : list) {
					System.out.println("danh sach");
					System.out.println(ng.toString());
				}
				break;
			case 3:
				dto = new NhagaDTO();
				System.out.println("nhap phan tu can tim");
				sc = new Scanner(System.in);
				dto.setCMND(sc.nextLine());
				boolean kiemtracmt = list.contains(dto);
				if(kiemtracmt==true) {
					System.out.println("ton tai cmnd so: " +dto.getCMND());
				}else {
					System.out.println("khong co");
				}
			break;
			case 4:
				
				// xoa phan tu
				dto = new NhagaDTO();
				System.out.println("nhap phan tu can xoa");
				sc = new Scanner(System.in);
				dto.setCMND(sc.nextLine());
				boolean kiemtra = list.contains(dto);
				if(kiemtra == true) {
					list.remove(dto);
					System.out.println("xoa thanh cong");
				}
				break;
			}
		} while (true);
	}
}
