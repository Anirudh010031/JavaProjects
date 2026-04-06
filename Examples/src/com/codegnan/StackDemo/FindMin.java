package com.codegnan.StackDemo;

import java.util.Stack;

public class FindMin {
//	public static void main(String[] args) {
//		int arr[] = {5,-2,0,-3};
//		Stack<Integer> stack = new Stack<>();
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i] > arr[i+1]) {
//				stack.push(arr[i+1]);
//			}
//		}
//		System.out.println(stack.pop());
//		
//		
//	} 
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> minstack = new Stack<>();
	//push
	public void push(int val) {
		stack.push(val);
		if(minstack.isEmpty()||val<=minstack.peek()) {
			minstack.push(val);
		}
	}
	//pop
	public void pop()
	{
		if(stack.peek().equals(minstack.peek())) {
			minstack.pop();
		}
	}
	//peek
	public int peek()
	{
		return stack.peek();
	}
	//min
	public int getMin()
	{
		return minstack.peek();
	}
	public static void main(String[] args) {
		FindMin f = new FindMin();
		f.push(5);
		f.push(-2);
		f.push(0);
		f.push(-3);
		
		System.out.println("get min :"+f.getMin());
		System.out.println("peek :"+f.peek());
		f.pop();
	}

}
