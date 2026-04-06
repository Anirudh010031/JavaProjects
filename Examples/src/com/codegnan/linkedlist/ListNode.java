package com.codegnan.linkedlist;

public class ListNode {
	int val;
	ListNode next;
	
	
	public ListNode(int n ) {
		this.val = n;
		
	}	
	public static void main(String[] args) {
		// creating list nodes
		
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(5);
		ListNode l3 = new ListNode(8);
		
		//Linking
		
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		
		// iterate values
		
		ListNode ptr=l1;
		while(ptr!=null) {
			System.out.println(ptr.val+ " ");
			ptr = ptr.next;
		}
	}
}
