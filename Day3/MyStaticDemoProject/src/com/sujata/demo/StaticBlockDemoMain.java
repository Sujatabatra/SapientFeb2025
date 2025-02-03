package com.sujata.demo;

class BaseOne{
	static {
		System.out.println("Hi I am static block from BaseOne");
	}
	{
		System.out.println("Hi I am instance block from BaseOne");
	}
	
	BaseOne(){
		System.out.println("Hi I am BaseOne Constructor");
	}
}

class DerivedOne extends BaseOne{
	static {
		System.out.println("Hi I am static block from DerivedOne");
	}
	{
		System.out.println("Hi I am instance block from DerivedOne");
	}
	
	DerivedOne(){
		System.out.println("Hi I am DerivedOne Constructor");
	}
}
public class StaticBlockDemoMain {

	public static void main(String args[]) {
//		BaseOne obj1=new BaseOne();//base static->instance->constructor
//		
//		System.out.println("================");
//		
//		DerivedOne obj2=new DerivedOne(); //derived static->instance(b)->constructor(b)->instance(d)->construtor(d)
		
		DerivedOne obj2=new DerivedOne();
		System.out.println("===============");
		
		BaseOne obj1=new BaseOne();
	}
}
