package com.sujata.superdemo;

public class BaseClass {

	int value1=10;
}

class DerivedClass extends BaseClass{
	int value1=20;
	
	public void show() {
		System.out.println(value1);
		System.out.println(super.value1);
		
	}
	
}
