package com.example.scheduleddemo;

public class StringImmutable {

	public static void main(String[] args) {

		int x = 5;
		int y = x;
		
		//The printf is a method of the java.io.PrintStream class and provides string formatting
		//Example, use %n for a new line character; Run the program to see the results
		System.out.printf("Coffee%nTea%nMilk%n");
	
		//Example, use %S as the first parameter followed by the  string; this output string in bold
		//also adds 15 char space in the beginning
		System.out.printf("%15S%n", "st louis, mo");

		
		System.out.printf("x = %d, y = %d %n", x, y);
		System.out.printf("x is the same as y: %s %n", x ==y);
		
		String first = "This is a String";
		String second = first;
		
		System.out.printf("first: %s %n", first);
		System.out.printf("Second: %s %n", second);
		System.out.printf("first is the same as second: %s %n", first == second);
	
		System.out.println();
		first.replace(" ", "_");
		System.out.println("first: " + first);
		 
		
	}

}
