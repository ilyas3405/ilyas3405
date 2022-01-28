package com.example.scheduleddemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class Employee {
	
}
public class MapPractice extends Object{

	public static void main(String[] args) {

		// HashMap is not synchronized. most commonly used
		Map<String, String> map = new HashMap<String, String>();
		
		ConcurrentMap<String, Employee> cmap = new ConcurrentHashMap<String, Employee>();
		
		
		// Below Hashtable is synchronized and for used for thread-safe implementation
		//Map<String, String> map = new Hashtable<String, String>();
		map.put("fruit", "apple");
		map.put("veg", "tomatos");
		map.put("liquid", "milk");
		map.put("solid", "rock");

		Set<String> keys = map.keySet();
		// Using streams and lambda expression to print out all keys
		// set.forEach(i -> System.out.println(i));

		// get only one value
		// System.out.println(map.get("veg"));

		// printing the entire keys
		// System.out.println(keys);

		// using enhanced for loop
		for (String key : keys) {
			System.out.println("The value of key " + key + " is " + map.get(key));
		}
		
		//Map<String, HashMap<String, HashMap<String, Set<String>>>> asnMap = new HashMap<String, HashMap<String, HashMap<String, Set<String>>>>();

		
	}
}
