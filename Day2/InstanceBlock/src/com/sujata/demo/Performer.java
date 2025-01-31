package com.sujata.demo;

public class Performer {
	private String name;

	{
		System.out.println("Setting up the Stage");
	}
	public Performer(String name) {
		super();
//		System.out.println("Performer");
		this.name = name;
	}
	public void perform() {
		System.out.println("No Performance");
	}
	public String getName() {
		return name;
	}
	
	
}
