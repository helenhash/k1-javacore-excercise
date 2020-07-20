package com.demo.core.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CustomerManagerment {
	String idNumber;
	String name;
	String destination;
	double priceTicket;
	
	String status;
	/**
	 * @param idNumber
	 * @param name
	 * @param destination
	 * @param priceTicket
	 */
	public CustomerManagerment(String idNumber, String name, String destination, double priceTicket) {
		super();
		this.idNumber = idNumber;
		this.name = name;
		this.destination = destination;
		this.priceTicket = priceTicket;
	}
	
	public String toString() {
		return idNumber + " " + name  + " " + destination + " " + priceTicket + " " + status;
	}
	

	/**
	 * @param status
	 */
	public CustomerManagerment(String status) {
		super();
		this.status = status;
	}


	public static void main(String[] args) {
		CustomerManagerment myCus_1 = new CustomerManagerment("191837489", "Nhi Ngo", "Bình Định", 750000);
		CustomerManagerment myCus_2 = new CustomerManagerment("200154597", "Giáp", "Nha Trang", 700000);
		CustomerManagerment myCus_3 = new CustomerManagerment("270512621", "Ất", "Đà Nẵng", 120000);
		CustomerManagerment myCus_4 = new CustomerManagerment("223762326", "Bính", "Quảng Ngãi", 300000);
		CustomerManagerment myCus_5 = new CustomerManagerment("247245287", "Đinh", "Lăng Cô", 100000);
		CustomerManagerment myCus_6 = new CustomerManagerment("146319034", "Mậu", "Đồng Hới", 350000);
		CustomerManagerment myCus_7 = new CustomerManagerment("171919557", "Kỷ", "Hải Lăng", 150000);
		CustomerManagerment myCus_8 = new CustomerManagerment("172088199", "Canh", "Cần Thơ", 850000);
		CustomerManagerment myCus_9 = new CustomerManagerment("241670172", "Tân", "Bình Định", 750000);
		CustomerManagerment myCus_10 = new CustomerManagerment("297555257", "Nhâm", "Hải Lăng", 150000);
		CustomerManagerment myCus_11 = new CustomerManagerment("257952893", "Quý", "Đà Nẵng", 120000);
		CustomerManagerment myCus_12 = new CustomerManagerment("155028997", "Tý", "Bình Định", 750000);
		
		//Customers List
		List<CustomerManagerment> myCustList = new ArrayList<CustomerManagerment>();
		
		//Nhaapppp
		myCustList.add(myCus_1);
		myCustList.add(myCus_2);
		myCustList.add(myCus_3);
		myCustList.add(myCus_4);
		myCustList.add(myCus_5);
		myCustList.add(myCus_6);
		myCustList.add(myCus_7);
		myCustList.add(myCus_8);
		myCustList.add(myCus_9);
		myCustList.add(myCus_10);
		myCustList.add(myCus_11);
		myCustList.add(myCus_12);
		
		
		//Show List, dùng Iterator tạo Loop với while chính xác hơn for:
		Iterator<CustomerManagerment> it = myCustList.iterator();
				
		System.out.println("Danh Sách Khách Hàng Đợi Mua Vé:" + "\n");
		
		for (CustomerManagerment cust : myCustList) {
			System.out.println(cust + "\n ");
		}
		
		System.out.println("Update danh sách: " + "\n");
		
		//Thêm KH mới
		CustomerManagerment myCus_13 = new CustomerManagerment("231189259", "Sửu", "Lăng Cô", 100000);
		myCustList.add(myCus_13);
		
		System.out.println(myCus_13 + "(vừa cập nhật)");
		
		System.out.println("---------------- \n");
		
				
		System.out.println("Danh Sách Mới: ");
		
		for (int i = 0; i < myCustList.size(); i++) {
			System.out.println(myCustList.get(i) + "\n ");
		}
		
		System.out.println("---------------- \n");
		
		//Tìm KH theo số CMND
		
		for (CustomerManagerment cust : myCustList) {
			if (cust.idNumber.equals("111123658")) {
				System.out.println("We found result matching to idNumber \"111123658\": " 
			+ cust);
				break;
			} else {
				System.out.println("Sorry, no results found matching idNumber \"111123658\"!");
				break;
			}
			
		}
		
		System.out.println("---------------- \n");
		System.out.println("Result found by List:");
		
		for (CustomerManagerment cust : myCustList) {
			if (cust.idNumber.equals("191837489")) {
				System.out.println("We found result matching to idNumber \"191837489\": " 
			+ cust);
				break;
			} else {
				System.out.println("Sorry, no results found matching idNumber \"191837489\"!");
				break;
			}
			
		}
		
		System.out.println("---------------- \n");
		
		//Tao Map
		Map<String, String> myCustMap = new HashMap<String, String>();
		myCustMap.put(myCus_1.idNumber, myCus_1.name);
		myCustMap.put(myCus_2.idNumber, myCus_2.name);
		myCustMap.put(myCus_3.idNumber, myCus_3.name);
		myCustMap.put(myCus_4.idNumber, myCus_4.name);
		myCustMap.put(myCus_5.idNumber, myCus_5.name);
		myCustMap.put(myCus_6.idNumber, myCus_6.name);
		myCustMap.put(myCus_7.idNumber, myCus_7.name);
		myCustMap.put(myCus_8.idNumber, myCus_8.name);
		myCustMap.put(myCus_9.idNumber, myCus_9.name);
		myCustMap.put(myCus_10.idNumber, myCus_10.name);
		myCustMap.put(myCus_11.idNumber, myCus_11.name);
		myCustMap.put(myCus_12.idNumber, myCus_12.name);
		myCustMap.put(myCus_13.idNumber, myCus_13.name);
		
		System.out.println("This is my Map of Customers:" + "\n" + myCustMap);
		
		System.out.println("---------------- \n");
		
		//Tìm từ Map
		System.out.println("Result found by Maps:");
		for (String i : myCustMap.keySet()) {
			if (i.equals("191837489")) {
				System.out.println("We found result matching to idNumber \"191837489\": " + myCustMap.get(i));
			}	
		}
		
		//Thêm field "status" cho Obj.
		myCus_1.status = "Queuing up";
		myCus_2.status = "Queuing up";
		myCus_3.status = "Queuing up";
		myCus_4.status = "Queuing up";
		myCus_5.status = "Queuing up";
		myCus_6.status = "Queuing up";
		myCus_7.status = "Queuing up";
		myCus_8.status = "Queuing up";
		myCus_9.status = "Queuing up";
		myCus_10.status = "Queuing up";
		myCus_11.status = "Queuing up";
		myCus_12.status = "Queuing up";
		myCus_13.status = "Queuing up";
		
		System.out.println("---------------- \n");
		
		System.out.println("Danh Sách Khách Hàng Đợi Mua Vé kèm Tình Trạng Vé:" + 
		"\n");
		
		for (CustomerManagerment cust : myCustList) {
			System.out.println(cust + "\n ");
		}
		
		System.out.println("---------------- \n");

		myCus_5.status = "Purchased";
		myCus_2.status = "purchased";
		myCus_10.status = "Purchased";
		myCus_12.status = "Purchased";
		myCus_7.status = "purchased";
		
		
		System.out.println("---------------- \n");
		
		System.out.println("Update Tình Trạng Vé:" + 
		"\n");
		
		for (CustomerManagerment cust : myCustList) {
			System.out.println(cust + "\n ");
		}
		
		//Thằng nào mua được rồi thì remove nào!
		
		System.out.println("---------------- \n");
		
		System.out.println("Update Danh Sách KH Đợi:" + "\n");
		
		for (CustomerManagerment cust : myCustList) {
            if (cust.status.equalsIgnoreCase("Purchased")) {
//            	System.out.println(cust.name);
//                myCustList.remove(myCustList.indexOf(cust));
            	myCustList.remove(cust.name);
            } else {
            	System.out.println(cust + "\n ");
            }
        }
		
		
	}
	

}