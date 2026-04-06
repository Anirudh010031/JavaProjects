package com.codegnan.threadsdemo;

public class Demo1 {
	 
	 public static void main(String[] args) {
		 
		//System.out.println(Thread.currentThread().getName());
		
		 //created a Thread object
		 CreateThread cT = new CreateThread();
		 cT.start();
		 
		 //"CPU scheduler " will decide which Thread has to run first by assigning the priority to the threads
		 for(int i=1; i<=10;i++)
		 {
			 try {
				Thread.sleep(1000); //used to pause the thread to work while the other thread is working
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			 System.out.println("Main thread : " +i);
		 }
		 
		 
		 
	 }

}
