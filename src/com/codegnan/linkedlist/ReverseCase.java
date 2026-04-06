package com.codegnan.linkedlist;

public class ReverseCase {
	
	 public ListNode reversing(ListNode head) {
		 {
			 if(head==null) {
				 
				 return null;
			 }
			 if(head.next == null) {
				 
				 return head;
			 }
			 ListNode preNode=null;
			 ListNode curNode = head;
			 
			 while(curNode!= null) {
				 ListNode nextNode = curNode.next;
				 curNode.next = preNode;
				 preNode = curNode;
				 curNode = nextNode;
			 }
			 head = preNode;
			 return head;
		 }
	 }
		 //traversing
		 
		 public void traverse(ListNode head)
		 {
			 
			 ListNode temp = head;
			 while(temp!=null) 
			 {
				 System.out.print(temp.val+"   ");
				 temp = temp.next;
			 }	 
		 
	 }
	
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(8);
		ListNode l4 = new ListNode(10);
		ListNode l5 = new ListNode(12);
		
		//link 
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		
		ListNode head = l1;
		ReverseCase rc = new ReverseCase();
		
		System.out.println("before reversing:");
		rc.traverse(head);
		System.out.println();
		
		rc.reversing(head);
		System.out.println();
		System.out.println("After reversing : ");
		rc.traverse(l5);
	}
	
	

}
