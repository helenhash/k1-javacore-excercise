/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Tran Huu Tuan
 */
public class Console {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Tam");
        Subject sub= new Subject("Mathematic", "01");
        System.out.printf("Teacher %s teaching %s for class %s ",teach.name,sub.name,sub.id);
        
    }
}
