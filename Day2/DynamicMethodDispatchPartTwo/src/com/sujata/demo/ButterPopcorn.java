package com.sujata.demo;

public class ButterPopcorn extends Popcorn {

	public ButterPopcorn(int quantity) {
		this.quantity=quantity;
	}
	private int quantity;
	
	@Override
	public void pop() {
		System.out.println("Butterly Delicious Popcorn Popping with "+getQuantity()+" ounces of butter");
	}

	public int getQuantity() {
		return quantity;
	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	
}
