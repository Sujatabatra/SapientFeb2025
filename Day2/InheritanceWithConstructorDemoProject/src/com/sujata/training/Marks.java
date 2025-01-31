package com.sujata.training;

import com.sujata.demo.Student;

public class Marks extends Student {

	private int marks1,marks2,marks3;

	public Marks() {
		super(0, null);
	}
	
	public Marks(int rollNumber, String name, int marks1, int marks2, int marks3) {
		//super is used to give explicit call to the base class constuctor,
//		usage of super is mandatory if base class don't have default constuctor
//		super must be the first statement in any constructor
		super(rollNumber, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	public void input(int rollNumber,String name,int marks1,int marks2,int marks3) {
		input(rollNumber, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public void display() {
//		System.out.println("Roll Number : "+getRollNumber());
//		System.out.println("Name : "+getName());
		//when super is used to call any of the method, that means it is refering to the base class version of that method
		super.display();
		System.out.println("Marks 1 : "+marks1);
		System.out.println("Marks 2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}
}
