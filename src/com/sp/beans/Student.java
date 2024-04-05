package com.sp.beans;

public class Student {

	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method");
		this.name = name;

	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("rollno setter method");
		this.rollno = rollno;
	}
	
	public void display() {
		
		System.out.println("Name "+name);
		System.out.println("RollNo "+rollno);
		
	}
	
	
	
	
}
