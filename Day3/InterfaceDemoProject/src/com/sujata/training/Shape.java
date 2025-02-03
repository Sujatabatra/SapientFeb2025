package com.sujata.training;

public interface Shape {

	void area();
//	void show();
	default void volume() {
		show();
		System.out.println(" Does not support volume");
	}
	
	private void show() {
		System.out.print(this.getClass());
	}
}
