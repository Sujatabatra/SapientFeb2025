package com.sujata.modular;
/*
 * for this code ignore static keyword
 */
public class MyModularDemoClass {

	//Data
	static int number,factorial;
	
	//function
	static void inputNumber(int n) {
		number=n;
	}
	
	static void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}
	
	static void displayResult() {
		System.out.println("Factorial : "+factorial);
	}
	
	public static void main(String[] args) {
		inputNumber(5);
		calculateFactorial();
		factorial=6;  //Logical Error
		displayResult();

	}

}
