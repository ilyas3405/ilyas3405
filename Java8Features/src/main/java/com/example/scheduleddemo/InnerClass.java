package com.example.scheduleddemo;

public class InnerClass {


	
	 static class InnerSubClass {

		static void printA() {
			 String a;
			
			System.out.println("Print from A");
		}
	}

	
	public static void main(String[] args) {

		System.out.println("Examples of Inner Class");
		InnerClass.InnerSubClass.printA();
		
		Object[] o = new Object[3];
		o[0] = new Integer[10];
		o[1] = new String("bombay");
		o[2] = new InnerClass.InnerSubClass();
		
		for(int i = 0, j=0; i < 10; i++, j++, System.out.println("something")) {
			System.out.println("Hi Ahmed .. Value of i " + i);
			System.out.println("Hi Shahab.. Value of j " + j);
			i++;
		}
	}

	
}
