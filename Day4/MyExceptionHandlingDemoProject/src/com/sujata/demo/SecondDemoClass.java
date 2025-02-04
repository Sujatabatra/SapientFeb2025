package com.sujata.demo;

import java.util.Scanner;

public class SecondDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int location=-1;
		try {
			System.out.println("Enter First Number : ");
			int number1=scanner.nextInt();
		
			System.out.println("Enter Second Number : ");
			int number2=scanner.nextInt();
			
			int result=number1/number2;
			System.out.println("Division Result : "+result);
			
			int arr[];
			System.out.println("Enter total number of elements in an array : ");
			int total=scanner.nextInt();
			arr=new int[total];
			
			for(int index=0;index<total;index++) {
				System.out.println("Enter "+(index+1)+" value of an array : ");
				arr[index]=scanner.nextInt();
			}
			
			
			System.out.println("Enter location in an array whoes value you want to view : ");
			location=scanner.nextInt();
			
			System.out.println("Value at location "+location+" in an array : "+arr[location-1]);
			
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Undefined");
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println(location+" location does not exist in an array!");
		}
		catch (NegativeArraySizeException negativeArraySizeException) {
			System.out.println("size of an array must be the positive integer");
		}
//		catch (RuntimeException runtimeException) {
//		catch(Throwable throwable) {
//		System.out.println("Something went wrong, please try again after sometime!");
//		}
		finally {
			System.out.println("Hi from finally block");
		}
		System.out.println("Good Bye from main method");

	}

}
