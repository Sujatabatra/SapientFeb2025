package com.sujata.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.sujata.entity.Person;

public class PersonLinkedHashSetDemoClass {

	public static void main(String[] args) {
		Set<Person> personList=new LinkedHashSet<Person>();

		personList.add(new Person(101, "AAAA", 67));
		personList.add(new Person(102, "BBBB", 47));
		personList.add(new Person(103, "CCCC", 57));
		personList.add(new Person(101, "AAAA", 67));
		personList.add(new Person(105, "EEEE", 37));
		
		for(Person person:personList) {
			System.out.println(person);
		}
	}

}
