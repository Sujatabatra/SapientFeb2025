package com.sujata.demo;

import lombok.Data;

@Data
public class Complex {

	private int real, imag;

	public void display() {
		System.out.print(real);
		if (imag > 0)
			System.out.println(" +" + imag + "i");
		else if (imag < 0)
			System.out.println(" " + imag + "i");
	}

	public void sumComplex(Complex complexOne, Complex complexTwo) {
		real = complexOne.real + complexTwo.real;
		imag = complexOne.imag + complexTwo.imag;
	}
	
	
	public Complex addComplex(Complex complex) {
		Complex sum=new Complex();
		sum.real=this.real+complex.real;
		sum.imag=this.imag+complex.imag;
		return sum;
	}

}
