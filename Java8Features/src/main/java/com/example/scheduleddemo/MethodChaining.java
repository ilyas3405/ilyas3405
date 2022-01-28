package com.example.scheduleddemo;

class A {
	private int a;
	private long b;
	private String c;

	A() {
		System.out.println("Calling the constructor. This is the default constructor");
	}

	public A setString(String d) {
		c = d;
		return this;
	}

	public A setInt(int e) {
		a = e;
		return this;
	}

	public A setfloat(long f) {
		b = f;
		return this;
	}

	void display() {
		System.out.println("Display=" + a + " " + b + " test c=" + c);
	}
}

public class MethodChaining {

	public static void main(String[] args) {

		/*
		 * A a = new A(); a.setInt(19); a.setfloat(10); a.setString("Ahmed");
		 * a.display();
		 */
		  new A()
		  	.setInt(37)
		  	.setfloat(38)
		  	.setString("Ahmed")
		  	.display();

	}
}
