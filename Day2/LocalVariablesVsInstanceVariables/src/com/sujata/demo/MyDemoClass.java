package com.sujata.demo;

public class MyDemoClass {

	//Instance Variable (Default Initial Value)
	int value1;
	
	public void display() {
		//Local Variable (does not have any default initial value)
		int value2;
//		Integer value2=new Integer(0);

		Integer value2=Integer.valueOf(0);?
		
		System.out.println("Value 1 : "+value1);
		System.out.println("Value 2 : "+value2);
	}
}
