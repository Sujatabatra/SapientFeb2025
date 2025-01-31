package com.sujata.demo;

public class Singer extends Performer {

	private String song;

	public Singer(String name, String song) {
		super(name);
//		System.out.println("Singer");
		this.song = song;
	}
	{
		System.out.println("Setting Mike");
	}
	@Override
	public void perform() {
		System.out.println(getName()+" is singing "+song);
	}
}
