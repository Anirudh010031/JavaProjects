package com.codegnan.threadsdemo;

// 2nd way to create a thread

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println("Thread running : " +i);
		}
	}
	
}
