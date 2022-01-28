package com.example.scheduleddemo;
interface SayableR{
	void say();
}

public class MethodReferenceInstance {

	public void saySomething() {
		System.out.println("Hello, this is non-static method");
		
	}
	
	public static void main(String[] arg) {
		MethodReferenceInstance methodreference = new MethodReferenceInstance(); //creating objects
		//Referring non-static method using reference
		SayableR sayable = methodreference::saySomething;
		
		//Calling interface method
		sayable.say();
		
		//Reffering non-static method using anonymus object
		SayableR sayable1 = new  MethodReferenceInstance()::saySomething;
		
		sayable1.say();
		
	}
	
}
