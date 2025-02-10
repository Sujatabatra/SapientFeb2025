package com.sujata.objectio.serialize.caseone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileCreateDemoClass {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("EmployeeDetails.txt");
				
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){
			
			Employee employee=new Employee(1, "ABCD", 45, "IT", "Associate", 55000);
			objectOutputStream.writeObject(employee);
			System.out.println("File created");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
