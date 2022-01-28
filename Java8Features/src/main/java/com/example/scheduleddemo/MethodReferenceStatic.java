package com.example.scheduleddemo;

import java.util.ArrayList;

interface SayableS{
	
	void say();
	
}

interface SayableSX {
	
	void say();
}

public class MethodReferenceStatic {

	public static void saySomething()
	{
		System.out.println("Hello, this is static method.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Referring static method
		SayableS sayable = MethodReferenceStatic::saySomething;
		//Example of instanceof keyword
		
		if (sayable instanceof SayableSX) {
			System.out.println("Yes, it is an instance");
		} else {
			System.out.println("No, it is an instance");	
			}
	 
		sayable.say();
				
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Shoeb");
		list.add("Idrees");
		list.add("Mudassir");
		list.add("Zaidu");
		

		for(String aString : list) {
		    System.out.println(aString);
		}
		
		list.forEach(a -> { System.out.println(a); });
	

	}

}


