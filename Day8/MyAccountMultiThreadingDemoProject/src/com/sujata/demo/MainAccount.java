package com.sujata.demo;

public class MainAccount {

	public static void main(String[] args) {
		Account a001=new Account();
		Account a002=new Account();
		
		Thread manan=new Thread(a001, "Manan");
		Thread chirag=new Thread(a002, "Chirag");
		
		manan.start();
		chirag.start();

	}

}
