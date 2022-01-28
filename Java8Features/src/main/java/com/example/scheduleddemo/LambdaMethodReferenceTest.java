package com.example.scheduleddemo;

import java.util.*;

public class LambdaMethodReferenceTest extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> countries = Arrays.asList("India", "United States", "Saudi", "Africa!");

		System.out.println("Printing using Lambda Expressions");
		countries.stream().map(s -> s.toUpperCase()).sorted().
			forEach(s -> System.out.println(s));

		System.out.println("");
		
		System.out.println("Printing using Reference Method");
		countries.stream().map(String::toUpperCase).sorted().
			forEach(System.out::println);
	}

}
