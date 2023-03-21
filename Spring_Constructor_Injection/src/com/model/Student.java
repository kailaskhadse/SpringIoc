package com.model;

public class Student {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public void display() {
		System.out.println("student roll :"+sid);
		System.out.println("student name :"+sname);
	}

}
