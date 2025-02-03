package com.sujata.demo;

/*abstract*/ public class BMW extends Car {

	public BMW(String color, String model) {
		super(color, model);
	}
	
	
	public void bmwEngine() {
		System.out.println("BMW engine goes BOOOOOM");
	}

	@Override
	public void engine() {
		bmwEngine();
		
	}
	
	

}
