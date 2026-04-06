package com.codegnan.threadsdemo;

public class CounterDemo {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		
		//create runnable object
		
		//Thread1 thread1 = new Thread1();

		//pass the runnable obj ref to thread constructor
		//Thread t1 = new Thread(thread1);
		
		
		// call start() which calls run()
		//t1.start();
		
		
		
		// create a thread using lambda expression
		
		//Thread t1 = new Thread(Runnable runnable);
		
		Thread t1 = new Thread(()->{        //implementation of lambda expression
			for(int i = 0; i<1000;i++) {
				counter.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		});
		
		t1.start();
		t2.start();   //intially already main thread will keep running so to run the created threads
		//we have to stop the main thread and should let the created thread run
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Final Count: "+counter.getCount());
	}


}

