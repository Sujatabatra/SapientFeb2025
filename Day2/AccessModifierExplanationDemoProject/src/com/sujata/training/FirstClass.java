package com.sujata.training;

public class FirstClass {

	private void showPrivate() {
		System.out.println("Hi I am private method from com.sujata.training.FirstClass");
	}
	
	void showDefault() {
		System.out.println("Hi I am default method from com.sujata.training.FirstClass");
	}
	
	protected void showProtected() {
		System.out.println("Hi I am protected method from com.sujata.training.FirstClass");
	}
	
	public void showPublic() {
		System.out.println("Hi I am public method from com.sujata.training.FirstClass");
	}
}
