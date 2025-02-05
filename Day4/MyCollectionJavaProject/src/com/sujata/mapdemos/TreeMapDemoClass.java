package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemoClass {

	public static void main(String[] args) {
		/*
		 * TreeMap is the sorted auto growable and auto shrinkable collection of key-value pairs,
		 * where keys are unique and values can be duplicated.
		 * sorting wrt keys
		 */
		
		Map<String, Integer> months=new TreeMap<String, Integer>();
		
		System.out.println("Size of months collection : "+months.size());
		System.out.println(months);
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);

		System.out.println("Size of months collection : "+months.size());
		System.out.println(months);
		
		months.put("Feb", 29);
		months.put("Jun", 30);
		
		System.out.println("Size of months collection : "+months.size());
		System.out.println(months);
		
		months.remove("Mar");
		System.out.println("Size of months collection : "+months.size());
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		for(String monthName:monthsName) {
			System.out.println(monthName+" have "+months.get(monthName)+" number of days");
		}
	}

}
