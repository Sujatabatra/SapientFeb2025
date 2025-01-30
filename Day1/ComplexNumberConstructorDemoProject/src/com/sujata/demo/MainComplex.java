package com.sujata.demo;

public class MainComplex {

	public static void main(String[] args) {
		Complex complexOne=new Complex(3,6);
//		complexOne.setReal(4);
//		complexOne.setImag(6);
		complexOne.display();
		
		Complex complexTwo=new Complex(9,-5);
//		complexTwo.setReal(7);
//		complexTwo.setImag(-4);
		complexTwo.display();
		
		Complex complexThree=new Complex(0,0);
		complexThree.sumComplex(complexOne, complexTwo);
		complexThree.display();
		
		Complex sumComplex=complexOne.addComplex(complexTwo);
		sumComplex.display();

	}

}
