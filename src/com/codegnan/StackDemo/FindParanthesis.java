package com.codegnan.StackDemo;

import java.util.Stack;

public class FindParanthesis {
	public static void main(String[] args) {
		String st = "[{()[]}()";
		Stack<Character> stack = new Stack<>();
		
		for(int i =0;i<st.length();i++) {
			
			char ch = st.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
				
			}
			
			else {
				if(ch==')'||ch=='}'||ch==']'){
	       if(stack.isEmpty()) {
	    	   System.out.println("invalid paranthesis: "+ch);
	       }
				}

	       
	       char top =stack.pop();
	       
	       if((ch==')'&& top!='(')||(ch=='}'&& top!='{')||(ch==']'&& top!='[')) {
	    	   System.out.println("invalid paranthesis: " +ch);
	    	   return;
	       }
	       }
			}
			if(!stack.isEmpty()) {
				System.out.println("unmatched bracket :" +stack.peek());
			}
			
		}
	}
		

