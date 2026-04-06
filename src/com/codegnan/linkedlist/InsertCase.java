package com.codegnan.linkedlist;

public class InsertCase {
	
	//at beginning
	
	public ListNode insertBeg(ListNode head , int valToInsert) {
		//creating a new node to insert value
		
		ListNode newNode = new ListNode(valToInsert);
		  newNode.next = head; // assigning newnode to next value to head
		  head = newNode; // head postion is changed to newnode;
		  return head;
	}
	
	//at mid point
	
	public ListNode insertMid(ListNode head, int valToInsert,int position) {
		// create new node
		
		ListNode newNode = new ListNode(valToInsert);
		ListNode ptr = head;
		for(int i=1;i<position-1;i++) {
			
			ptr=ptr.next;
		
		}
		newNode.next = ptr.next;
		ptr.next= newNode;
		return head;
	}
	//at end
	
	public ListNode insertEnd(ListNode head,int valToInsert) {
		//create new node
		ListNode newNode = new ListNode(valToInsert); 
		
		ListNode ptr=head;
		
		while(ptr.next!=null) {
			
			ptr = ptr.next;
		}
		
		ptr.next = newNode;
		return head;
	}
	//traverse
	public void traverse(ListNode head) {
		
		ListNode temp = head;
		while(temp!=null) {
			System.out.println(temp.val+ " ");
			temp = temp.next;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		//create listnodes
		
		ListNode l1= new ListNode(3);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(8);
		
		
		//link nodes
		
		l1.next=l2;
		l2.next=l3;
		l3.next=null;
		
		//iterate nodes
		
		ListNode head = l1;
		
		//iterate nodes
		
		InsertCase ic = new InsertCase();
		
		System.out.println("before insertion at beginning :" );
		ic.traverse(head);
		
		head=ic.insertBeg(head, 2);
		System.out.println();
		System.out.println("after insertion at beginning: " );
		ic.traverse(head);
		
		
		head = ic.insertMid(head, 7, 3);
		System.out.println();
		System.out.println("after insertion at middle ");    
		ic.traverse(head);
		
		head = ic.insertEnd(head, 10);
		System.out.println();
		System.out.println("after adding at end : ");
		ic.traverse(head);
		
		
		
		
		
	}

}
