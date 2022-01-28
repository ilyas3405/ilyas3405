package com.example.scheduleddemo;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * <p>
 * Class for testing Java 8 features. Let me practice this one.
 * 
 * <p>
 * Nothing else to say
 * 
 */

public class Java8Tester {

	public static void main(String args[]) {

		if (Java8Tester.class instanceof Object) {
			System.out.println(Java8Tester.class.toString() + " is an instanceof the Object class");
		}

		// AugoBoxing and Unboxing; primitive data type to Class datatype
		// Wrapper class
		Integer x = 5; // using a wrapper class
		int y = 0; // using a primitive type
		y = x.intValue(); // example of unboxing
		System.out.println(x);

		int a = 50;
		Integer b = 0;
		a = Integer.valueOf(a); //example of boxing

		List<String> names3 = new ArrayList<String>();

		List<String> names1 = new ArrayList<String>();
		names1.add("Shoeb ");
		names1.add("Ahmed ");
		names1.add("Zaid ");
		names1.add("Abdullah ");
		names1.add("Mudassir ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Ilyas ");
		names2.add("Ayoub ");
		names2.add("Sami ");
		names2.add("Summiya ");
		names2.add("Maryam ");

		Java8Tester tester = new Java8Tester();

		System.out.println("Sort using Java 7 syntax: ");

		tester.sortUsingJava7(names1);
		System.out.println(names1);

		System.out.println("Sort using Java 8 syntax: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);

		MyClass student = new MyClass();

		List<Object> values = new ArrayList<Object>();

		values.add("Hello");
		values.add(1977);
		values.add(3.5);

		values.add("End of the ListArray");
		System.out.println();

		Iterator<Object> iterator = values.iterator();

		/*
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		values.forEach(i -> System.out.println(i));

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("Shoeb", 41);
		hashmap.put("mudassir", 37);
		hashmap.put("abdullah", 5);
		hashmap.put("fattu", (int) 2.5);

		System.out.println(hashmap.toString());
		Boolean bbb = hashmap.containsKey("fattsu");

		hashmap.putIfAbsent("mudassi2r", 37);

		System.out.println(hashmap.toString());

		System.out.println(b);

		for (Map.Entry mapElement : hashmap.entrySet()) {
			String key = (String) mapElement.getKey();

			// adding some years to their ages
			int value = (int) mapElement.getValue() + 5;

			System.out.println(key + " age after 5 years is " + value);

			// Using Set to store a list of names and printing it out on a screen
			// Set<String> set = new HashSet<String>(); //Unsorted
			Set<String> set = new TreeSet<String>(); // Sorted
			set.add("Shoeb");
			set.add("Zaheer");
			set.add("Raghu");
			set.add("Abdul");
			set.add("abdul");
			set.add("Kareem");
			set.add("Shoeb");

			for (String s : set) {
				System.out.println(s);
			}

			List<String> countries = Arrays.asList("India", "US", "UK", "China", "Hong Kong");

			countries.forEach(i -> System.out.println(i));

			System.out.println("\n2 Practicing ....");
			System.out.println("\n3 Practicing ....");
			System.out.println("\n4 Practicing ....");
			System.out.println("\n5 Practicing ....");
		}
	}

	// sort using java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
	}

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}
