package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemoClass {

	public static void main(String[] args) {
		try(FileWriter fileWriter=new FileWriter("DemoCharIO.txt");){
			String str="Hello I am demonstrating Char IO in files.";
			fileWriter.write(str);
			System.out.println("File created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
