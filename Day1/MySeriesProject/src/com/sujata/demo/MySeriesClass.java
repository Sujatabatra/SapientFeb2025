package com.sujata.demo;

import com.sujata.oop.Factorial;

public class MySeriesClass {

	private int number;
	private double sum;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public double getSum() {
		return sum;
	}
	
	public void sumSeries() {
		
		for(int count=1;count<=number;count++) {
			Factorial factorial=new Factorial();
			factorial.setNumber(count);
			sum=sum+factorial.getFactorial()/count;
		}
	}
}
