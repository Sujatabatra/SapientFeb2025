package com.sujata.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

class FileOpenDemoClass {

	public void fileOpen(String name)throws FileNotFoundException {
		// Opens the file for reading
		FileInputStream fileOutputStream = new FileInputStream(name);

		System.out.println(name + "file open for reading");

	}
}

public class ThrowsExceptionDemoClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fname=null;
		try {
		System.out.println("Enter the file name : ");
		fname = scanner.next();

		FileOpenDemoClass fileOpenDemo = new FileOpenDemoClass();
		fileOpenDemo.fileOpen(fname);
		}
		catch(InputMismatchException inputMismatchException) {
			System.out.println("Kindly enter string");
		}
		catch(FileNotFoundException fileNotFoundException) {
			System.out.println(fname+" file doesnot exist");
		}
		catch(Exception exception) {
			System.out.println("Something went wrong!");
		}
	}

}
