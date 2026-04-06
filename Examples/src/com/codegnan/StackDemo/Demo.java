package com.codegnan.StackDemo;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {
		Stack<Integer> st= new Stack<>();
		
		st.push(78);
		st.push(20);
		st.push(909);
		st.push(56);
		st.push(78);
		st.push(88);
		System.out.println("size of the Stack :" +st.size());
		System.out.println(" top element:" +st.peek());
		System.out.println("search element :" +st.search(909));
		System.out.println("remove element :" +st.pop());
		System.out.println("find is empty or not :" +st.isEmpty());
		
	}

}
