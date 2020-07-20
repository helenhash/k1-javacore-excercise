package com.demo.core.lab6;

public class NhagaDTO {
	private String cMND;
	private String name;
	private String gaden;
	private double giatien;
	public NhagaDTO() {
		// TODO Auto-generated constructor stub
	}
	public NhagaDTO(String cMND, String name, String gaden, double giatien) {
		this.cMND = cMND;
		this.name = name;
		this.gaden = gaden;
		this.giatien = giatien;
	}
	public String getCMND() {
		return cMND;
	}
	public void setCMND(String cMND) {
		this.cMND = cMND;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cMND +"\t" + name +"\t" +gaden+"\t" +giatien;
	}
	 public boolean equals(Object obj) {
	       NhagaDTO ng = (NhagaDTO)obj;
	        if(ng.getCMND().equals(this.getCMND()))
	            return true;
	        return false;
	    }
}
