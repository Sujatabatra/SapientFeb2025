package com.sujata.demo;

public class Audi extends Car {

	public Audi(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void engine() {
		System.out.println("Audi engine goes AOOOOOM");
	}

}
