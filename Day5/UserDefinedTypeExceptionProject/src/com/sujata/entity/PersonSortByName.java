package com.sujata.entity;

import java.util.Comparator;

public class PersonSortByName implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		if(person1.equals(person2))
			return 0;
		else if(person1.getpName().compareTo(person2.getpName())>0)
				return 1;
		return -1;
	}

}
