package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileOpenDemo{
	
	public void fileOpen(String name) {
		//Opens the file for reading 
		try {
			FileInputStream fileOutputStream=new FileInputStream(name);
			
			System.out.println(name+"file open for reading");
		} catch (FileNotFoundException e) {
				System.out.println(name+" named file does not exist!");
			
		}
		
	}
}
public class CheckedExceptionDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the file name : ");
		String fname=scanner.next();
		
		FileOpenDemo fileOpenDemo=new FileOpenDemo();
		fileOpenDemo.fileOpen(fname);
		
		
	}

}
