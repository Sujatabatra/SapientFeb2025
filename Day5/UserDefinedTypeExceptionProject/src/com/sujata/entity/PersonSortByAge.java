package com.sujata.entity;

import java.util.Comparator;

public class PersonSortByAge implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		if(person1.equals(person2))
			return 0;
		else if(person1.getpAge()>person2.getpAge())
			return 1;
		else if(person1.getpAge()<person2.getpAge())
			return -1;
		return 1;
	}

}
