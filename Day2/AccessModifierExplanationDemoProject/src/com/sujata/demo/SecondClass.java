package com.sujata.demo;

public class SecondClass {

	private void showPrivate() {
		System.out.println("Hi I am private method from com.sujata.demo.SecondClass");
	}
	
	void showDefault() {
		System.out.println("Hi I am default method from com.sujata.demo.SecondClass");
	}
	
	protected void showProtected() {
		System.out.println("Hi I am protected method from com.sujata.demo.SecondClass");
	}
	
	public void showPublic() {
		System.out.println("Hi I am public method from com.sujata.demo.SecondClass");
	}
	
	public void callFirstClassMethods() {
		FirstClass firstClass=new FirstClass();  //com.sujata.demo ,as it is the current package
		
		firstClass.showDefault();
		firstClass.showProtected();
		firstClass.showPublic();
		
		//Different class , different package
		com.sujata.training.FirstClass fClass=new com.sujata.training.FirstClass();
		fClass.showPublic();
	}
}
