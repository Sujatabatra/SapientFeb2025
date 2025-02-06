package com.sujata.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.entity.MyPerson;
import com.sujata.entity.Person;

public class PersonTreeSetDemoClass {

	public static void main(String[] args) {
		Set<MyPerson> personList=new TreeSet<MyPerson>();

		personList.add(new MyPerson(101, "AAAA", 67));
		personList.add(new MyPerson(102, "BBBB", 67));
		personList.add(new MyPerson(103, "CCCC", 57));
		personList.add(new MyPerson(101, "AAAA", 67));
		personList.add(new MyPerson(105, "EEEE", 37));
		
		for(MyPerson person:personList) {
			System.out.println(person);
		}
	}

}
