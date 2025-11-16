package com.demo.linkedlist;

public class MyLinkedList<T> {
	
	private Node head;
	
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
		}
	}
	
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	
	public void add(T data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = newNode;
	}
	
	public void printReverse() {
		printReverse(head);
	}
	
	public void printReverse(Node head) {
		if(head==null) {
			System.out.println();
			return;
		}
		printReverse(head.next);
		System.out.print(head.data+"  ");
	}
	
	public void display() {
		if(head==null) return;
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void deleteAllPrims() {
		Node pre=null;
		Node temp=head;
		while(temp!=null) {
			if(isPrime(temp.data)) {
				if(temp==head) {
					head=head.next;
					temp.next=null;
					temp=head;
				}
				else {
					pre.next=temp.next;
					temp.next=null;
					temp=pre.next;
				}
			}else {
				pre=temp;
				temp=temp.next;
			}
		}
	}

	private boolean isPrime(T data) {
		if((int) data==1) return false;
		for(int i=2 ; i<=Math.sqrt((int)data) ; i++) {
			if((int)data%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public void reverse() {
		if(head==null) return;
		Node pre = null;
		Node cur = head;
		Node next = head.next;
		while(cur!=null) {
			cur.next=pre;
			pre=cur;
			cur=next;
			if(next!=null) {
				next=next.next;
			}
		}
		head=pre;
	}
}
