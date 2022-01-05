package com.practice.generics;

import javax.print.attribute.standard.Finishings;

class IntPrinter {

	void print(Integer i) {
		System.out.printf("Printing the integer %d%n", i);
	}
}

class DoublePrinter {
	void print(Double d) {
		System.out.printf("Printing the double %f%n", d);
	}
}

class StringPrinter {
	void print(String s) {
		System.out.printf("Printing the string %s%n", s);
	}
}

class GenericPrinter<T extends Number> {

	void print(T g) {
		System.out.println("Printing the generic wrapper type" + g);
	}
}

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		System.out.println("fibonacchi number at position " + n + " is :: " + fibonacchi(n));

		// 0,1,2,3,5,8,13,19

	}

	private static long fibonacchi(int n) {
		// TODO Auto-generated method stub
		if (n <= 1)

		{
			return n;
		}
		System.out.println("Value in the method " + n);
		return fibonacchi(n - 1) + fibonacchi(n - 2);
	}

}
