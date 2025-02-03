package com.sujata.demo;
/*
 * final can be a variable,method or class
 * if variable is final : we can't modify its value after initialization
 */
public class FirstFinalDemo {
	
	private int value1;
	final private int value2=80;
	private final int value3;
	
	public FirstFinalDemo(int value3) {
		super();
		this.value3 = value3;
	}
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
//	public void setValue2(int value2) {
//		this.value2 = value2;
//	}
	public int getValue3() {
		return value3;
	}
	
	
	

}
