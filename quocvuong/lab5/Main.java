package com.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Nhập tên khách hàng :");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Nhập số cmnd khách hàng :");
		String cmnd = new Scanner(System.in).nextLine();
		System.out.println("Ga đến :");
		String arrivals = new Scanner(System.in).nextLine();
		System.out.println("Nhập giá tiền :");
		int price = new Scanner(System.in).nextInt();


		//Tạo danh sách

		User usernew = new User();
		usernew.setSoCMND(cmnd);
		usernew.setName(name);
		usernew.setPrice(price);
		usernew.setArrivals(arrivals);

		List<User> user = new ArrayList<>();
		User usernew2 = new User("1a2b","vuong","da nang",20000);
		User usernew3 = new User("1a2c","trinh","hue",30000);
		User usernew4 = new User("2b3d","quoc anh","sai gon",50000);
		User usernew5 = new User("2b3z","cong","quy nhon",35000);
		User usernew6 = new User("3y2z","khanh","ha noi",7000);

		user.add(usernew2);
		user.add(usernew3);
		user.add(usernew4);
		user.add(usernew5);
		user.add(usernew6);
		user.add(usernew);

		//hiển thị list


		for(User x: user ) {
			System.out.println("Tên các khách hàng trong hàng chờ : " +x.getName());
			System.out.println("Số CMND khách hàng : " +x.getSoCMND());
			System.out.println("Ga đến : " + x.getArrivals());
			System.out.println("Giá tiền : " + x.getPrice());
			System.out.println("======================================");
		}
		System.out.println("Nhập CMND cần tìm :");
		
		boolean exist = false;
		do {
			String cmt = new Scanner(System.in).nextLine();
			for(int index = 0; index<user.size(); index++) {
				if(user.get(index).getSoCMND().equals(cmt)) {		
					user.remove(index);
					exist = true;
				}else{
					if (index == user.size() - 1 && exist == false) {
						System.out.println("Không có khách hàng có số CMND " + cmt + " trong hàng chờ");
						System.out.println("Mời bạn nhập lại :");
					}
				}
			}
		}while(exist==false);
			
		System.out.println("Danh sách khách hàng đang chờ :");
		for(User x: user ) {
			System.out.println("Tên các khách hàng trong hàng chờ : " +x.getName());
			System.out.println("Số CMND khách hàng : " +x.getSoCMND());
			System.out.println("Ga đến : " + x.getArrivals());
			System.out.println("Giá tiền : " + x.getPrice());
			System.out.println("======================================");
		}
		
	}
}

