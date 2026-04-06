package com.codegnan.queue;

import java.util.Stack;

public class QueueUsingStack {
	
	//creations of two stacks
	
	static Stack<Integer> input = new Stack<>();
	
	static Stack<Integer> output = new Stack<>();
	//operations to perform.
	//push
	//pop
	//peek
	//empty
	
	//pushing
	
	public  void push(int n) {
	   input.push(n);
	}
	
	//popping
	
	public int pop() {
		peek();
		return output.pop(); //output stack
	}
	
	//peeking
	
	public int peek() {
		if(output.isEmpty()) {
			while(!input.isEmpty())
			{
				
				output.push(input.pop());
			}
		}
		return output.peek();
	}
	
	//empty

	public boolean empty()
	{
		return input.isEmpty() && output.isEmpty();
	}
	
	public static void main(String[] args) {
		 
		QueueUsingStack q = new QueueUsingStack();
		
		q.push(12);
	 	q.push(13);
		q.push(14);
		q.push(143);
		
		System.out.println("peek the element:" +q.peek());
		System.out.println("pop element: " +q.pop());
		System.out.println("peek : " +q.peek());
		
		
	}
	
	

}
