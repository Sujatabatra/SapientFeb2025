package com.sujata.demo;

import java.util.Scanner;

public class MainEggConvertor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Total Number of Eggs : ");
		int totalEggs=scanner.nextInt();
		
		EggConvertor eggConvertor=new EggConvertor();
		eggConvertor.setTotalNoOfEggs(totalEggs);
		eggConvertor.convert();
		
		
		System.out.println(eggConvertor.getEggs());
		

	}

}
