package com.sujata.demo;
/*
 * if the method is final, we can't override that method
 */
public class SecondFinalDemo {
	
	private /*final*/ void methodOne() {
		
	}
	
	
	public final void methodTwo() {
		System.out.println("Hi I am final methodTwo from com.sujata.demo.SecondFinalDemo");
	}
	
	public void methodTwo(int x) {
		System.out.println("Hi I am final methodTwo from com.sujata.demo.SecondFinalDemo");
	}

}

class SecondDerivedFinalDemo extends SecondFinalDemo{
	
//	@Override
//	public final void methodTwo() {
//		System.out.println("Hi I am final methodTwo from com.sujata.demo.SecondFinalDemo");
//	}
	
	@Override
	public void methodTwo(int x) {
		System.out.println("Hi I am final methodTwo from com.sujata.demo.SecondFinalDemo");
	}
}