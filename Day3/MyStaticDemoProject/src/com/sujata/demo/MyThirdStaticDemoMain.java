package com.sujata.demo;

class Base{
	public void methodOne() {
		System.out.println("Hi I am Base class methodOne");
	}
	static public void methodTwo() {
		System.out.println("Hi I am Base class methodTwo");
	}
	public void methodThree() {
		System.out.println("Hi I am Base class methodThree");
	}
	public void methodFour() {
		System.out.println("Hi I am Base class methodFour");
	}
}

class Derived extends Base{
	
	static public void methodTwo() {
		System.out.println("Hi I am Derived class methodTwo");
	}
	@Override
	public void methodThree() {
		System.out.println("Hi I am Derived class methodThree");
	}
}
public class MyThirdStaticDemoMain {

	public static void main(String[] args) {
		Base obj1=new Base();
		obj1.methodTwo();
		obj1=new Derived();
		obj1.methodTwo();
		
		Derived obj;
		obj=new Derived();
		obj.methodTwo();
		

	}

}
