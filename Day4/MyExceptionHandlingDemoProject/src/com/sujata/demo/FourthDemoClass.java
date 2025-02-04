package com.sujata.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyDivideDemo{
	
	public void divide(int number1,int number2) {
//		try {
			int result=number1/number2;
			System.out.println("Result of Division : "+result);
			
			System.out.println("Bye from try block");
			
//		}
//		catch(NegativeArraySizeException negativeArraySizeException) {
//			negativeArraySizeException.printStackTrace();
//		}
//		finally {
//			System.out.println("Hi from finally block");
//		}
		System.out.println("Bye from divide method");
	}
}
public class FourthDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
		System.out.println("Enter First Number : ");
		int number1=scanner.nextInt();
	
		System.out.println("Enter Second Number : ");
		int number2=scanner.nextInt();

		MyDivideDemo myDivide=new MyDivideDemo();
		myDivide.divide(number1, number2);
		}
		catch(InputMismatchException exception) {
			System.out.println("Kindly enter integer value to see the output");
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Undefined");
		}
	}

}
