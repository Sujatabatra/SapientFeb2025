package com.sujata.demo;

class MySecondStaticDemo {

	private int value1;
	private static int value2;
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public static int getValue2() {
		return value2;
	}
	public static void setValue2(int value2) {
		MySecondStaticDemo.value2 = value2;
	}
	
	
}


public class MySecondStaticDemoMain{
	public static void main(String args[]) {
//		MySecondStaticDemo.value2=20;
		
		MySecondStaticDemo obj1=new MySecondStaticDemo();
		
		MySecondStaticDemo obj2=new MySecondStaticDemo();
		
		System.out.println("obj1.value1 : "+obj1.getValue1());
		System.out.println("obj2.value1 : "+obj2.getValue1());
		System.out.println("obj1.value2 : "+obj1.getValue2());
		System.out.println("obj2.value2 : "+obj2.getValue2());
		
		obj1.setValue1(15); //obj1.value1=15;
		obj2.setValue2(20); //obj2.value1=20;
		obj1.setValue2(5);  // obj1.value2=5;
		obj2.setValue2(7);  //obj2.value2=7;
		System.out.println("============================");
		System.out.println("obj1.value1 : "+obj1.getValue1());
		System.out.println("obj2.value1 : "+obj2.getValue1());
		System.out.println("obj1.value2 : "+obj1.getValue2());
		System.out.println("obj2.value2 : "+obj2.getValue2());
		
	}
	
}