package com.sujata.objectio.serialize.casetwo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileCreateDemoClass {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmployeeDetails.txt");
				
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){
			
			Person person=new Person(1, "Akash", 34, new Address(101, "Street M", "Delhi", "Delhi", "110001"));
			objectOutputStream.writeObject(person);
			System.out.println("File created");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
