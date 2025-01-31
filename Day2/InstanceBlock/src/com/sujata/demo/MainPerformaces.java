package com.sujata.demo;

public class MainPerformaces {

	public static void main(String[] args) {
		
		Performer p1=new Juggler("Lipika", 5);
		p1.perform();
		
		Performer p2=new Singer("Alok", "Twinkle Twinkle");
		p2.perform();
		
		Performer p3=new Singer("Chirag", "Happy Nation");
		p3.perform();

	}

}
