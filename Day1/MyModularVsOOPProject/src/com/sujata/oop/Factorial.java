package com.sujata.oop;

/*
 * if data is readable :create public getter method
 * if datsa is modifiable : create public setter method
 * if data is both readacle as well as modifiable : create public getter and setter
 */
public class Factorial {

	//number as modifiable
	//factorial as readable
	private int number,factorial;

		public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		calculateFactorial();
		return factorial;
	}
	
	private void calculateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}

	
	
	
}
