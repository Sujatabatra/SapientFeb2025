package com.sujata.demo;



/*
 * Source file naming rules
 * 1. A source file can have only one public class,
 *  and its fine name must be same as that of public class
 */

public class Unit {

	private int gross;
	private int dozen;
	private int remaining;
	public int getGross() {
		return gross;
	}
	public void setGross(int gross) {
		this.gross = gross;
	}
	public int getDozen() {
		return dozen;
	}
	public void setDozen(int dozen) {
		this.dozen = dozen;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	@Override
	public String toString() {
		return "Unit [gross=" + gross + ", dozen=" + dozen + ", remaining=" + remaining + "]";
	}
	
	
}
