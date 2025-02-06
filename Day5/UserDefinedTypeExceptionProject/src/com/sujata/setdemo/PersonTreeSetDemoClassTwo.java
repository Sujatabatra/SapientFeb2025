package com.sujata.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.entity.MyPerson;
import com.sujata.entity.Person;
import com.sujata.entity.PersonSortByAge;
import com.sujata.entity.PersonSortByName;

public class PersonTreeSetDemoClassTwo {

	public static void main(String[] args) {
		Set<Person> personList=new TreeSet<Person>(new PersonSortByAge());

		personList.add(new Person(101, "AAAA", 67));
		personList.add(new Person(102, "BBBB", 67));
		personList.add(new Person(103, "CCCC", 57));
		personList.add(new Person(101, "AAAA", 67));
		personList.add(new Person(105, "EEEE", 37));
		
		for(Person person:personList) {
			System.out.println(person);
		}
	}

}
