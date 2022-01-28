package com.example.scheduleddemo;

interface Messageable {
	Message getMessage(String msg);

}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class MethodReferenceConstructor {

	public static void main(String[] args) {
		
		//Note below we creating reference to an Interface
		Messageable hello = Message::new;
		hello.getMessage("hello from Reference to Constructor");

	}

}
