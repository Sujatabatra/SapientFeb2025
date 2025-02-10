package com.sujata.objectio.serialize.casetwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadDemoClass {

	public static void main(String[] args) {
		try(FileInputStream fileInputStream=new FileInputStream("EmployeeDetails.txt");
				ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);){
			
			Person person=(Person)objectInputStream.readObject();
			System.out.println(person);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
