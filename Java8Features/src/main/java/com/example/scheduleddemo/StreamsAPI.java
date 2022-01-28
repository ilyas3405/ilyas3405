package com.example.scheduleddemo;

import java.util.stream.IntStream;

public class StreamsAPI {

	public static void main(String[] args) {
		// IntStream
		// The old way of finding the lowest of given numbers
		// building an array

		int[] numbers = { 4, 10, 10, 20, 32, 32, 12 };

		int[] copy; 
		copy = numbers;
		
		
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}

		}
		System.out.println("Above is based on traditional way of looping through the array");
		System.out.println("Minimum is " + min);
		System.out.println(" ");

		System.out.println("Below is using a Java 8 Sreams API");
		// System.out.println("Minimum is " + IntStream.of(numbers).min().getAsInt());
		// Using lambda expression to find the Max
		IntStream.of(numbers).min().ifPresent(v1 -> System.out.println(v1));

	
		// Using method reference to find max number
		System.out.println(" Using method ref to find max number");
		IntStream.of(numbers).max().ifPresent(System.out::println);
	}

}
