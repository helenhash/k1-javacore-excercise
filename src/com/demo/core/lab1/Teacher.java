package com.demo.core.lab1;

public class Teacher {

	public String nameTeacher;
	public int ageOfTeacher;
	public String subject;
	/** Dùng Contructor khỏi tạo Obj. Teacher, dùng các field đã khai báo như trên:
	 * @param nameTeacher
	 * @param ageOfTeacher
	 * @param subject
	 */
	public Teacher(String nameTeacher, int ageOfTeacher, String subject) {
		super();
		this.nameTeacher = nameTeacher;
		this.ageOfTeacher = ageOfTeacher;
		this.subject = subject;
	}
	/**
	 * @param subject
	 */
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	
	
	}



