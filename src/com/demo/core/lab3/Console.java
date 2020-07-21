/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Tran Huu Tuan
 */
public class Console {
    public static void main(String[] args) {
       Rectangle rec = new Rectangle(10,20) {};
       System.out.println(rec.getArea());
       Triangle tri = new Triangle(20,30);
       System.out.println(tri.getArea());
    }
}
