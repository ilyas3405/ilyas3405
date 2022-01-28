package com.example.scheduleddemo;

public class RunnableDemo {
//https://www.geeksforgeeks.org/runnable-interface-in-java/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread is- " + Thread.currentThread().getName() + " " + Thread.currentThread().getId()
				+ " " + Thread.currentThread().getPriority());

		RunnableDemo runnabledemo = new RunnableDemo();
    	 Thread t1 = new Thread(runnabledemo.new RunnableImpl());

	// You can remove the above two lines and use the below.
	//	Thread t1 = new Thread(new RunnableDemo().new RunnableImpl());
		t1.start();

	}
	
	private class RunnableImpl implements Runnable  {

	//private class RunnableImpl implements Runnable {

		public void run() {
			System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId() + " "
					+ Thread.currentThread().getPriority() + " " + ", executing run() method!");

		}
	}

}
