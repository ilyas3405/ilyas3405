package com.example.scheduleddemo;

public class EvenNumber {

	public static void main(String args[]) {

		int n = 100;
		System.out.println("Even numbers from 1 to " + n + " are :");

		for (int i = 1; i <= n; i++) {
			{
				if (i % 2 != 0) {
					System.out.println(i + " ");
				}
			}

		}
		System.out.println("Mod of 3 is " + 7 % 2);

	}
}
