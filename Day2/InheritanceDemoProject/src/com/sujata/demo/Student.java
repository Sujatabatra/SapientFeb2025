package com.sujata.demo;

public class Student {

	private int rollNumber;
	private String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void input(int rollNo,String name) {
		this.rollNumber=rollNo;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
	}
	
}
