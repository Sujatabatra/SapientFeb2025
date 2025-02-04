package com.sujata.training;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
		Person person=new Person();
		System.out.println("Enter Person Name : ");
		person.setName(scanner.next());
		System.out.println("Enter Person Age : ");
		person.setAge(scanner.nextInt());
		
		System.out.println(person);
		
		System.out.println("=======================");
		
		
		System.out.println("Enter Person Name : ");
		String name=scanner.next();
		System.out.println("Enter Person Age : ");
		int age=scanner.nextInt();
		Person person1=new Person(name,age);
		}
		catch(AgeUncheckedException ageUncheckedException) {
			System.out.println("This is unchecked exception");
		}
		catch (AgeCheckedException ageCheckedException) {
			System.out.println("This is checked exception");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong");
		}

	}

}
