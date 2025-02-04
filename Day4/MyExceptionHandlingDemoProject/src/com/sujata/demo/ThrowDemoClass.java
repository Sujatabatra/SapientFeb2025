package com.sujata.demo;

import java.util.Scanner;

class DivideNumbers {
	private int number1;
	private int number2;
	private int result;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		if (number2 == 0)
			throw new ArithmeticException("Denominator cannot be zero");
		this.number2 = number2;
	}

	public int getResult() {
		calculate();
		return result;
	}

	private void calculate() {
		result=number1/number2;
	}

}

public class ThrowDemoClass {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		DivideNumbers divideNumbers=new DivideNumbers();
		
		System.out.println("Enter First Number ");
		divideNumbers.setNumber1(scanner.nextInt());
		
		System.out.println("Enter Second Number ");
		divideNumbers.setNumber2(scanner.nextInt());
		
		System.out.println("Result : "+divideNumbers.getResult());
		
	}

}
