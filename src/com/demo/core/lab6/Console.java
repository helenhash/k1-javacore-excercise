/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

/**
 *
 * @author Tran Huu Tuan
 */
public class Console {
    public static void main(String[] args) {
    	QuanLiVeTau qlvt = new QuanLiVeTau();
    	Scanner sc = new Scanner(System.in);
        ArrayList<QuanLiVeTau> list = new ArrayList<>();
        QuanLiVeTau n1=new QuanLiVeTau("123", "TUan", "Hue", 50);
        QuanLiVeTau n2=new QuanLiVeTau("456", "nuaT", "SaiGon", 40);
        QuanLiVeTau n3=new QuanLiVeTau("789", "abc", "tuan", 60);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        System.out.println("===================================");
        System.out.println("Them khach hang vao hang doi:");
        System.out.print("Them CMND: ");
        qlvt.setCmnd(sc.nextLine());
        System.out.print("Them Ten: ");
        qlvt.setTenKH(sc.nextLine());
        System.out.print("Them Gaden: ");
        qlvt.setGaDen(sc.nextLine());
        System.out.print("Them Gia: ");
        qlvt.setGiaTien(sc.nextInt());
        if(list.add(qlvt)) {
        	System.out.println("da them");
        	System.out.println("===================================");
        	for (QuanLiVeTau n: list) {
        		System.out.println(n.toString());
        	}
        	
        }
        System.out.println("==================================="); 
        System.out.println("Nhap cmnd hanh khach can them: ");
        Scanner cmt=new Scanner(System.in);
        String cmnd = cmt.nextLine();
        QuanLiVeTau cmndSearch = null;
        for (QuanLiVeTau cmndKH: list) {
        	if (cmndKH.getCmnd().equals(cmnd)){
        		cmndSearch= cmndKH;
        	}
        	if (cmndSearch != null) {
    			System.out.println(cmndSearch.toString());
    		}else{
    			System.out.println("khong co");
    		}
        }
    }
    
}
