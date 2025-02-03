package com.sujata.demo;

public class Scoda extends Car {

	public Scoda(String color, String model) {
		super(color, model);
	}
	
	@Override
	public void engine() {
		System.out.println("Scoda engine goes SOOOOOM");
	}

}
