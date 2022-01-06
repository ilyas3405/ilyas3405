package com.practice.generics;

import java.util.function.Predicate;

public class JavaAppEmptyMainMethod {

	static {
		System.out.println("Inside a static block");
		int x = 30; // can initialize static variables
		System.out.println("value of variable x :: " + x);

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Inside thread - initialize a new thread");
			}
		};
		thread.start();

	}

	
	public static void main(String[] args) {
		// keep this empty

	
	}

}
