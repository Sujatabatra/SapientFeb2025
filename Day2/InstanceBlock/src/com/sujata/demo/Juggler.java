package com.sujata.demo;

public class Juggler extends Performer {

	private int balls;

	{
		System.out.println("Setting up The Table");
	}
	public Juggler(String name, int balls) {
		super(name);
//		System.out.println("Juggler");
		this.balls = balls;
	}
	
	@Override
	public void perform() {
		System.out.println(getName()+" is juggling "+balls+" balls");
	}
}
