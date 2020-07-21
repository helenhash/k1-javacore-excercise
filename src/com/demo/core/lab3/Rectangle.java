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
public abstract class Rectangle {
    private int lenght;
    private int witdh;

    public Rectangle() {
    }

    public Rectangle(int lenght, int witdh) {
        this.lenght = lenght;
        this.witdh = witdh;
    }

    /**
     * @return the lenght
     */
    public int getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    /**
     * @return the witdh
     */
    public int getWitdh() {
        return witdh;
    }

    /**
     * @param witdh the witdh to set
     */
    public void setWitdh(int witdh) {
        this.witdh = witdh;
    }
    public double getArea(){
        return witdh*lenght;
    }
}
