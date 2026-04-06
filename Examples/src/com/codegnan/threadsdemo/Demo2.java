package com.codegnan.threadsdemo;

public class Demo2 {
	public static void main(String[] args) {
		
		
		// step 1: create a Runnable object
		MyRunnable obj = new MyRunnable();
		
		// step 2: Pass Runnable to Thread 
		Thread t1 = new Thread(obj);
		
		//step 3 : start the thread
		
		t1.start();
		
	}

}
