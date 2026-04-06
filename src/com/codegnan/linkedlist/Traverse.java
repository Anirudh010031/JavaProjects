package com.codegnan.linkedlist;


public class Traverse {
	public ListNode traverseEle(ListNode head) {
		ListNode temp = head;
		while(temp!= null) {
			System.out.println(temp.val+ " ");
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		 //create listnodes
		ListNode l1 = new ListNode(78);
		ListNode l2 = new ListNode(87);
		ListNode l3 = new ListNode(67);
		ListNode l4 = new ListNode(98);
		 
		//link nodes
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		
		 // iterate nodes
		
		ListNode head = l1;
		Traverse t = new Traverse();
		t.traverseEle(head);
		
	}

}
