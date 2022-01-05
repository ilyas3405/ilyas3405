package com.practice.generics;

import java.util.Arrays;
import java.util.List;

public class Wildcards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> listIntObj = Arrays.asList(1, 2, 3, 4);

		List<Object> listStr = Arrays.asList("Ali", "Abdul's", "Sam", "Joh\"n");

		// Using same method to print string and integer lists
		printListObjects(listIntObj);

		// Using same method to print string and integer lists
		printListObjects(listStr);

		// Using same method to print string and integer lists
		printListWildcard(listIntObj);

		List<?> listwildcard = Arrays.asList(1, 2, 3, 4);
		// Using same method to print string and integer lists
		printListWildcard(listwildcard);

		List<Integer> listInt = Arrays.asList(1, 2, 3, 4);
		// printListObjects(listInt); //wont compile
		printListWildcard(listInt);
	}

	private static void printListObjects(List<Object> list) {
		// Because we are using

		for (Object element : list) {
			System.out.println(element + " ");
		}

	}

	private static void printListWildcard(List<?> list) {
		// Because we are using

		for (Object element : list) {
			System.out.println(element + " ");
		}

	}

}
