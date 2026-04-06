package com.codegnan.threadsdemo;

public class Producer implements Runnable {
	 
	 Message msg = new Message();

	@Override
	public void run() {


	msg.write();
		
	}

}
