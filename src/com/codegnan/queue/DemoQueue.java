package com.codegnan.queue;

import java.util.LinkedList;

import java.util.Queue;

public class DemoQueue {
	 public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); //implementation of queue using linked list
		q.add(34);
		q.add(230);
		q.offer(64);
		q.offer(63);
		q.add(87);
		q.add(83);
		
		System.out.println("all elements"+q);
		System.out.println("remove elements:" +q.poll());
		System.out.println("remove element:" +q.remove());
		System.out.println("fetch element: " +q.peek());
		
		System.out.println("fetch element:" +q.element());
		System.out.println("print elements :" +q);
		
		System.out.println(" is empty:  " +q.isEmpty());
		System.out.println("size is : " +q.size());
				
	}

}
