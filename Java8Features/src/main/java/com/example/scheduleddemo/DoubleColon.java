package com.example.scheduleddemo;

import java.util.stream.Stream;

public class DoubleColon {

	public static void main(String[] args) {
		//Creating stream object with some string values
		Stream<String> stream = Stream.of("St Louis","MO","Houston","TX","Chicago","IL");

		//Using Lambda expression to print all values of a stream object
		//Below is generated using a lambda expression
		stream.forEach(ekk -> System.out.println(ekk));
		
		//Using a double colon to print all values
		//below is generated a double colon; This is a simple replacement of the for each loop
		//method reference
		stream.forEach(System.out::println);

	}

}
