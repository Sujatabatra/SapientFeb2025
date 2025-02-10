package com.sujata.byteio;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemoClass {

	public static void main(String args[]) {
		try(BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(System.out);){
		
			byte arr[]= {'S','U','J','A','T','A'};
			bufferedOutputStream.write(arr);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
