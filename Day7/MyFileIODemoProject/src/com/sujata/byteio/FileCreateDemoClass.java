package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateDemoClass {

	public static void main(String args[]) {
		
		FileOutputStream fileOutputStream=null;
		
		try {
			fileOutputStream=new FileOutputStream("DemoByteIO.txt");
			
			byte[] arr= {'S','U','J','A','T','A','\n','D','E','L','H','I'};
			
			fileOutputStream.write(arr);
			System.out.println("File created!");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
