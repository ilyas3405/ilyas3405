//package com.timbuchalka;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

	private static final int EXITCODE = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console console = System.console();

		if (console == null) {
			System.err.println("No console.");
			System.exit(1);
		}

		while (true) {

			String myRegEx = "";
			myRegEx = console.readLine("%nEnter your regex: ");

			String anObject = "EXIT";
			if (myRegEx.toUpperCase().equals(anObject)) {

				System.exit(EXITCODE);
			}

			Matcher matcher = extracted(console, myRegEx);

			boolean found = false;

			while (matcher.find()) {
				console.format("I found the text" + " \"%s\" startin at " + " index %d and ending at index %d.%n",
						matcher.group(), matcher.start(), matcher.end());
				  found = true;
			}

			if (!found) {
				console.format("Sorry No match found.%n");
			}

		}
	}
/*
	These is some comments for this method
	For new programmers to read and understand.
	*/
	
	private static Matcher extracted(Console console, String myRegEx) {
		Pattern pattern = Pattern.compile(myRegEx);

		Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));
		return matcher;
	}

}
