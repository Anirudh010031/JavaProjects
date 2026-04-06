package com.codegnan.linkedlist;

public class DeleteCase {
	 
	 // at beginning
	
	public ListNode deleteBegging(ListNode head) {
		
		head = head.next;
		return head;
		
	}
	// delete at position
	public ListNode deletePosition(ListNode head, int posi) {
		ListNode ptr = head;
		for(int i=1;i<posi-1;i++) {
			ptr= ptr.next;
		}
		ListNode delEle = ptr.next;
		ListNode nextEle = delEle.next;
		ptr.next= nextEle;
		return head;
	}
	
	// delete at end
	public ListNode deleteEnd(ListNode head) {
		ListNode ptr = head;
		while(ptr.next.next!=null) {
			
			ptr=ptr.next;
			
		}
		ptr.next = null;
		return head;
	
	}
	 
	public void traverse (ListNode head) {
		
		ListNode temp = head;
		while(temp!= null) {
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		//creating nodes 
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
		 
		 DeleteCase dc = new DeleteCase();
		 dc.traverse(head);
		 
		 head = dc.deleteBegging(head);
		 System.out.println();
		 dc.traverse(head);
		 
		 dc.deletePosition(head, 3);
		 System.out.println();
		 dc.traverse(head);
		 
		 dc.deleteEnd(head);
		 System.out.println();
		 dc.traverse(head);
	}

}
