package com.hinhhoc;

public class HinhVuong extends HinhCN implements TinhToan {

	public HinhVuong(int canh) {
		super(canh, canh);
	}
	

	@Override
	public int tinhChuVi() {
		return this.getChieuDai()*4;
	}


	@Override
	public int tinhDienTich() {
		return this.getChieuDai()*this.getChieuDai();
	}

	@Override
	public boolean whithdraw(int a, double b) {
		return false;
	}
	
	


	@Override
	public double queryBalence(int a) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double tinhDienTich(HinhVuong hv) {
		return hv.getChieuDai()*hv.getChieuRong();
	}

}
