package com.example.scheduleddemo;
/*
 * user defined exception
 * 
 * 
 */

class InvalidAgeException extends Exception {
	
}



public class Exceptions01 {

	static void status(int age) throws InvalidAgeException {
		if (age>0) {
			
		}
		else
			throw new InvalidAgeException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
