package com.codegnan.threadsdemo;
 
// 1st way of creating a thread
 
// when you extend thread class to create a thread, you lock your class, your class cannot extend any other class.
// 
// when you implement Runnable interface to create a thread, your are free to extend any class.
// 
// creating a thread using Runnable always preferred in projects.
// we can use java 8 features like Lambda expression when you use Runnable.

public class CreateThread extends Thread{

	
	// every new thread must have a run method which describes the tasks that has to be  performed
	 public void run() {
		 
		  for(int i = 1;i<=10;i++) {
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			  System.out.println("Created Thread " +i);
			  
		  }
	 }
}
