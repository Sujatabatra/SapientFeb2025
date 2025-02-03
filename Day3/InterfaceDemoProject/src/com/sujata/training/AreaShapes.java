package com.sujata.training;

public class AreaShapes {

	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void calculateArea() {
		shape.area();
		shape.volume();
	}
}
