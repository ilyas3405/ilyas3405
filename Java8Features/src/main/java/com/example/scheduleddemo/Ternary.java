package com.example.scheduleddemo;

import java.util.HashMap;

public class Ternary  extends Object{

	public static void  main(String[] args) {

	int n1 = 5, n2 = 10;
	String str;
	System.out.println("First Num" + n1);
	System.out.println("Second Num" + n2);
	
 
	//using the itrnary to do condition 
	//Largest of the the two numbers
	str = (n1 > n2) ? displayTrue() : displayFalse(); 
		System.out.println(str);
 
		}
	 
	
	static String displayTrue() {
		return "True value";
	}

	static String displayFalse() {
		return "False value";
	}
}
