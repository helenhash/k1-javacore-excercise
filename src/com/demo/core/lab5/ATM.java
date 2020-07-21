/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Tran Huu Tuan
 */
public interface ATM { 
    public boolean windraw(int a , double b);
    public boolean deposit( int c , double d);
    public boolean queryBlance(int e);
    public boolean login( String f , String g);
    public boolean logout(String h);
}
