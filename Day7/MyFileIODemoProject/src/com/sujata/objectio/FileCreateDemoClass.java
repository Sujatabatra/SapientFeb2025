package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileCreateDemoClass {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("PersonDetails.txt");
				
				ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){
			
			Person person=new Person(101, "AAAA", 56);
			objectOutputStream.writeObject(person);
			System.out.println("File created");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
