package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemoClass {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet is the unique ordered collection of objects,
		 * which is auto growable and auto shrinkable.
		 */
		Set<Integer> collection=new LinkedHashSet<Integer>();
//		Set(ParentClass reference)=LinkedHashSet (Child Class Object)
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(10);
		collection.add(40);
		collection.add(70);
		collection.add(20);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.add(70);
		collection.add(15);
		
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);
		
		collection.remove(70);
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);

		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
