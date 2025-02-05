package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemoClass {

	public static void main(String[] args) {
		/*
		 * ArrayList : duplicate indexed ordered auto growable and auto shrinkable
		 * collection of objects
		 */

		List<Integer> collection=new LinkedList<Integer>();
		
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
		
		collection.remove(Integer.valueOf(70));
		System.out.println("Size of collection : "+collection.size());
		System.out.println(collection);

		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<collection.size();index++) {
			System.out.println(collection.get(index));
		}
		
		System.out.println("Traversal using for each loop");
		for(Integer element:collection) {
			System.out.println(element);
		}
		
		System.out.println("Traversal using Iterator");
		Iterator<Integer> iterator=collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Traversal using List Iterator");
		ListIterator<Integer> listIterator=collection.listIterator();
		
		while(listIterator.hasNext())
			listIterator.next();
		
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
	}

}
