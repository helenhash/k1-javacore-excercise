/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Tran Huu Tuan
 */
public class Console {
    public static void main(String[] args) {
        ArrayList<QuanLiVeTau> list = new ArrayList<>();
        QuanLiVeTau n1=new QuanLiVeTau("123", "TUan", "Hue", 50);
        QuanLiVeTau n2=new QuanLiVeTau("456", "nuaT", "SaiGon", 40);
        QuanLiVeTau n3=new QuanLiVeTau("789", "abc", "tuan", 60);
        list.add(n1);
        list.add(n2);
        list.add(n3);
    }
    
}
