package com.sujata.demo;

public final class ThirdFinalDemo {

	public void one() {
		System.out.println("One");
	}
	
	public void two() {
		System.out.println("two");
	}
	
}

class ThirdDerivedDemo /*extends ThirdFinalDemo*/{
	
	public void show() {
		System.out.println("Show");
		ThirdFinalDemo obj=new ThirdFinalDemo();
		obj.one();
	}
}

//class DemoString extends String{
//	
//}