package com.hinhhoc;

public abstract class HinhCN {

	private int chieuDai;
	private int chieuRong;
	

	public HinhCN() {
		super();
	}
	public HinhCN(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public abstract int tinhChuVi();
	
}
