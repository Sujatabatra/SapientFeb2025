package com.sujata.misc;

import com.sujata.entity.Person;

public class PersonEqualityCheckClass {

	public static void main(String[] args) {
		int i=10;
		int j=10;
		if(i==j)
			System.out.println(i+" is equal to "+j);
		else
			System.out.println(i+" is not equal to "+j);
		
		
		Person p1=new Person(101, "AAAA", 56);
		Person p2=new Person(101, "AAAA", 56);

		if(p1==p2)
			System.out.println(p1+" is equal to "+p2);
		else
			System.out.println(p1+" is not equal to "+p2);
		
		Person p3;
		p3=p2;
		
		if(p3==p2)
			System.out.println(p3+" is equal to "+p2);
		else
			System.out.println(p3+" is not equal to "+p2);
		
		
		System.out.println("===============================");
		if(p1.equals(p2))
			System.out.println(p1+" is equal to "+p2);
		else
			System.out.println(p1+" is not equal to "+p2);
		
		
		
//		if(p3.equals(p2))
//			System.out.println(p3+" is equal to "+p2);
//		else
//			System.out.println(p3+" is not equal to "+p2);
		
		System.out.println("p1 hashcode : "+p1.hashCode());
		System.out.println("p2 hashcode : "+p2.hashCode());
		
	}

}
