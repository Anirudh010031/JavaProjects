package com.codegnan.threadsdemo;

public class Consumer implements Runnable{
	
	Message msg = new Message();

	@Override
	public void run() {

    msg.read();
		
	}

}
