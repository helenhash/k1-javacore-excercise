package com.de.core.lab1;

public class Subject {
	
	private String name ;
	private int classId;
	
	public Subject(String name, int classId) {
		super();
		this.name = name;
		this.classId = classId;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
	
}
