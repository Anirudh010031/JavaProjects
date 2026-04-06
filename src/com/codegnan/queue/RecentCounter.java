package com.codegnan.queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
	
	 Queue<Integer> q  = new LinkedList<>();
	 
	public int ping(int t) {
		
		q.add(t);
		
		while(q.peek()< t-3000)
		{
			q.poll();
		}
		
		// to ensure queue size should not exceed the size 3
		while(q.size()>3)
		{
			q.poll();
		}
		return q.size();
		
	}

public static void main(String[] args) {
	
	RecentCounter rc = new RecentCounter();
	System.out.println(rc.ping(1));
	System.out.println(rc.ping(3001));
	System.out.println(rc.ping(3002));
	System.out.println(rc.ping(3003));
	System.out.println(rc.ping(3004));
	System.out.println(rc.ping(3005));
	System.out.println(rc.ping(9002));
	
	
}
}
