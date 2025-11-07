package com.demo.linkedList;

public class DoublyLinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data=data;
			next=null;
			prev=null;
		}
		
	}

	public DoublyLinkedList() {
		head=null;
	}
	
	public void addNode(int x) {
		
		Node newNode=new Node(x);
		Node temp=head;
		if(head==null) {
			head=newNode;
			
			
		}else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			newNode.prev=temp;
			temp.next=newNode;
			
		}
	
		
	}
	public void display() {
		
		Node temp=head;
		
		while(temp!=null) {
			
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void addByPos(int pos,int val) {
		Node newNode=new Node(val);
		Node temp=head;
		if(pos==1) {
			newNode.next=head;
			if(head!=null) {
			head.prev=newNode;
			}
			head=newNode;
		}
		else {
			 for(int i=1;temp!=null&&i<=pos-2;i++) {
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 newNode.next=temp.next;
				 newNode.prev=temp;
				 temp.next=newNode;
				 
				 if(newNode.next!=null) {
					 newNode.next.prev=newNode;
					 
				 }
			 }else {
			 System.out.println("pos is beyond the limit");
			 }
			 
		}
	}
	
	public void deleteByValue(int value) {
		
		Node temp=head;
		if(head.data==value) {
			 if(head.next!=null) {
				head.next.prev=null;
			 }
			
			
			head=temp.next;
			temp.next=null;
			
		}else {
			while(temp!=null&&temp.data!=value) {
				temp=temp.next;
				
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
				temp.next.prev=temp.prev;
				temp.next=null;
				}
				temp.prev=null;
				
				
			}else {
				System.out.println("value not fond");
			}
		}
		
	}
	public void deleteByPos(int pos) {
		if(head!=null && pos==1) {
			head=head.next;
			if(head!=null) {
				head.prev.next=null; 
				head.prev=null;
			}
		}
		else {
			Node temp = head;
			for(int i=0 ; i<pos-1 && temp!=null ; i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null)
				   temp.next.prev=temp.prev;
				temp.next=null ;
				temp.prev=null;
			}
			else {
				System.out.println("Position not found");
			}
		}
		
	}
	public void traverseList() {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+"---->");
			temp=temp.prev;
		}
		System.out.println("head");
	}
}
