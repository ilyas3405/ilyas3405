package com.example.scheduleddemo;

/* Thread can be created using two mechanism.
1. Extending the Thread class
2. Implementing the Runnable Interface*/

//Practice Thread creation by extending the Thread Class
//class MultithreadingDemo extends Thread {
class MultithreadingDemo implements Runnable {
	
	public void run()
	{
		try 
		{
			//Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId());
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}

//Main Class
public class ExtendingThreadClassMain
{
	public static void main(String[] args) {
		int n = 8;  //Number of threads
		
		for (int i=0; i < n; i++) {
			//MultithreadingDemo object = new MultithreadingDemo();
			Thread object = new Thread(new MultithreadingDemo());
			object.start();
			
		}
	}
}