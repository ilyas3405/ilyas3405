package com.example.scheduleddemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Generics {

	public static void main(String[] args) {
		//Generics Example --> Java Generics features introduced in Java 5.0 - http://tutorials.jenkov.com/java-generics/index.html
		//Used mostly in Collections but can also be used to define user defined data-types
		//explicitly defining what kind of objects to be stored in a list

		
		//below LIST example without Generic - List  is an interface; Extends Collections interface
		List<Object> list = new ArrayList<Object>();
		//The right side generic can be ignored. Like shown below
		//List<Object> list = new ArrayList<>();
		list.add(new Integer(2));
		list.add("a string");
		//List all the content to output console
		System.out.println(list);
		
		//To get the values in variables, we need to cast them
		Integer i = (Integer)list.get(0);
		String s = (String)list.get(1);
		if (list.get(0) instanceof Integer) {
			System.out.println("The value of list item(0) " + i);				
		}
		
		if(list.get(1) instanceof String) {
			System.out.println("The value of list item(1) " + s);
		}
		
		//below SET example using Generic; i.e, specifying the variable type
		//remember Set is a interface; Extends Collection interface simalr to List
		Set<String> set = new HashSet<String>();
		set.add("Chicago");
		set.add("Houston");
		set.add("St Louis");
		set.add("Dallas");
		//Using Lamnda and streams
		//set.forEach(setitem -> System.out.println(setitem));
	
		//Using the Iterator object
		Iterator<String> iterator = set.iterator(); 
			 while(iterator.hasNext()) {
				String city = iterator.next();
				System.out.println(city);
			}
			 
		//Using the for loop
		for(String city : set) {
			System.out.println(city);
		}
		
		//below Map example using Genric; i.e specifying the variable type
		//Map is an interface; 
		Map<Integer, String> map = new HashMap<Integer, String>();
		
	}

}
