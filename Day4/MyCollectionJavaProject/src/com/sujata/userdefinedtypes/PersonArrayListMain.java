package com.sujata.userdefinedtypes;

import java.util.ArrayList;
import java.util.List;

public class PersonArrayListMain {

	public static void main(String[] args) {
		List<Person> personList=new ArrayList<Person>();
		
		personList.add(new Person(1, "AAAA"));
		personList.add(new Employee(2, "ABCD", "Executive", "25000"));
		
		for(Person person:personList) {
			person.display();
			System.out.println("==========");
		}

	}

}
