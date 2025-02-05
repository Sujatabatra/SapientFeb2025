package com.sujata.userdefinedtypes;

public class BusinessMan extends Person {

	private double annualTurnover;
	
	public BusinessMan() {
		
	}

	public BusinessMan(int pId, String pName, double annualTurnover) {
		super(pId, pName);
		this.annualTurnover = annualTurnover;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Annual TurnOver "+annualTurnover);
	}
}
