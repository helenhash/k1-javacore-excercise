/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Tran Huu Tuan
 */
public class QuanLiVeTau {
    private String cmnd;
    private String tenKH;
    private String gaDen;
    private double giaTien;

    public QuanLiVeTau() {
    }

    public QuanLiVeTau(String cmnd, String tenKH, String gaDen, double giaTien) {
        this.cmnd = cmnd;
        this.tenKH = tenKH;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    /**
     * @return the cmnd
     */
    public String getCmnd() {
        return cmnd;
    }

    /**
     * @param cmnd the cmnd to set
     */
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    /**
     * @return the tenKH
     */
    public String getTenKH() {
        return tenKH;
    }

    /**
     * @param tenKH the tenKH to set
     */
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    /**
     * @return the gaDen
     */
    public String getGaDen() {
        return gaDen;
    }

    /**
     * @param gaDen the gaDen to set
     */
    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    /**
     * @return the giaTien
     */
    public double getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
    
}
