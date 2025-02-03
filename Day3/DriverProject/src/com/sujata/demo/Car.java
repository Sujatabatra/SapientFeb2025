package com.sujata.demo;

abstract public class Car {

	private String color;
	private String model;
	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	abstract public void engine();
	
}
