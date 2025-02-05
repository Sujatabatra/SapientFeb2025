package com.sujata.userdefinedtypes;

public class Employee extends Person {

	private String designation;
	private String salary;
	
	public Employee() {
		
	}

	public Employee(int pId, String pName, String designation, String salary) {
		super(pId, pName);
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("deignation "+designation+" salary "+salary);
	}
}
