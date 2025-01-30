package com.sujata.demo;

public class MainSeries {

	public static void main(String[] args) {
		MySeriesClass mySeriesClass=new MySeriesClass();
		mySeriesClass.setNumber(4);
		mySeriesClass.sumSeries();
		System.out.println("Result : "+mySeriesClass.getSum());

	}

}
