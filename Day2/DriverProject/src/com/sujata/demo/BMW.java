package com.sujata.demo;

public class BMW extends Car {

	public BMW(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void engine() {
		System.out.println("BMW engine goes BOOOOOM");
	}

}
