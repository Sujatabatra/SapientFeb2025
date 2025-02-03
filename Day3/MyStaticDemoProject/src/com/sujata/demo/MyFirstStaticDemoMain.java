package com.sujata.demo;

class MyFirstStaticDemo {

	int value1;
	static int value2;
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
}


public class MyFirstStaticDemoMain{
	public static void main(String args[]) {
		MyFirstStaticDemo.value2=20;
		
		MyFirstStaticDemo obj1=new MyFirstStaticDemo();
		
		MyFirstStaticDemo obj2=new MyFirstStaticDemo();
		
		System.out.println("obj1.value1 : "+obj1.value1);
		System.out.println("obj2.value1 : "+obj2.value1);
		System.out.println("obj1.value2 : "+obj1.value2);
		System.out.println("obj2.value2 : "+obj2.value2);
		
		obj1.value1=15;
		obj2.value1=20;
		obj1.value2=5;
		obj2.value2=7;
		System.out.println("============================");
		System.out.println("obj1.value1 : "+obj1.value1);
		System.out.println("obj2.value1 : "+obj2.value1);
		System.out.println("obj1.value2 : "+obj1.value2);
		System.out.println("obj2.value2 : "+obj2.value2);
		
	}
	
}