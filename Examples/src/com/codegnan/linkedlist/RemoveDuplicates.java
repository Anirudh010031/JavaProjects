package com.codegnan.linkedlist;

public class RemoveDuplicates {
	 
	 public static ListNode removeDuplicates(ListNode head) {
		 ListNode current = head;
		 
		 while(current!=null && current.next!=null) {
			 if(current.val == current.next.val) {
				 
				 current.next = current.next.next;
				 
			 }
			 else {
				 current=current.next;
			 }
		 }
		 
		 return head;
	 }

	 public static void PrintNewList(ListNode head) {
		 ListNode temp = head;
		 while(temp!=null) {
			 System.out.println(temp.val+ " -> ");
			 temp = temp.next;
		 }
		 System.out.println("null");
	 }
	 
	 public static void main(String[] args) {
		 // creating sorted linked list:
		 ListNode head = new ListNode(1);
		 head.next = new ListNode(1);
		 head.next.next = new ListNode(2);
		 head.next.next.next = new ListNode(3);
		 head.next.next.next.next = new ListNode(3);
		 
		 System.out.println("Original :");
		 
		 PrintNewList(head);
		 head = removeDuplicates(head);
		 
		 System.out.println("After Removing Duplicates: ");
		 PrintNewList(head);
	 }
	 
}
