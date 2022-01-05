package com.practice.generics;

public class RecursionTutorial {

	static int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi(3);
	}

	private static void sayHi(int count) {
		System.out.println("Hi Mr X " + i);
		i = i + 1;
		
		if (count <= 1) {
			return;
		}
		sayHi(count -1);
	}
}
