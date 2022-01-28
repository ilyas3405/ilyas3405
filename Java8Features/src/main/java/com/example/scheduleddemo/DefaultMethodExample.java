package com.example.scheduleddemo;

//Use below example
//https://www.tutorialspoint.com/java8/java8_default_methods.htm

public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car carinstance = new car();
		carinstance.print();
	
		

	}

}

interface vehicle {
//default method
	default void print() {
		System.out.println("I am a vehice");
	}

//Cannot have two default method. so using static	
	static void blowHorn() {
		System.out.println("I can blow horn");
		int i;
		i = 10;
		int j;
		j = 20;
		System.out.println(i + j);
	}

}

//since we want to create a default print method again, we will create a new interface
interface fourweeler {
	// default method. Since we want to use print again
	default void print() {
		System.out.println("I am a fourweeler");
	}
}


class car implements vehicle, fourweeler {

	public void print() {
		// TODO Auto-generated method stub
		fourweeler.super.print();
		vehicle.super.print();
		vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}