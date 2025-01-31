package com.sujata.demo;

public class MainPopCorn {

	public static void main(String[] args) {
		/*
		 * Base Class Reference Variable is type compatible with derived class,
		 * but reverse is not true
		 */
		
		//Base class
		Popcorn popcorn;

		popcorn=new Popcorn();
		popcorn.pop();
		
		popcorn=new ButterPopcorn();
		popcorn.pop();
		
		popcorn=new CaramelPopcorn();
		popcorn.pop();
	}

}
