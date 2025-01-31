package com.sujata.demo;

public class FirstClass {

	private void showPrivate() {
		System.out.println("Hi I am private method from com.sujata.demo.FirstClass");
	}
	
	void showDefault() {
		System.out.println("Hi I am default method from com.sujata.demo.FirstClass");
	}
	
	protected void showProtected() {
		System.out.println("Hi I am protected method from com.sujata.demo.FirstClass");
	}
	
	public void showPublic() {
		System.out.println("Hi I am public method from com.sujata.demo.FirstClass");
	}
}
