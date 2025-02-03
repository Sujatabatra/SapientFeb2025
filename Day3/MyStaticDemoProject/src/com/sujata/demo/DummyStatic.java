package com.sujata.demo;

public class DummyStatic {

	static {
		System.out.println("Hi i am static block");
	}
	public static void methodOne() {
		System.out.println("methodOne from DummyStatic");
	}
	
	static public void methodTwo() {
		System.out.println("methodTwo from DummyStatic");
	}
	
	public void methodThree() {
		System.out.println("methodThree from DummyStatic");
	}
	
	public static void methodFour() {
		System.out.println("methodFour from DummyStatic");
	}
	
	public void methodFive() {
		System.out.println("methodFive from DummyStatic");
	}
	public void methodSix() {
		System.out.println("methodSix from DummyStatic");
	}
}
