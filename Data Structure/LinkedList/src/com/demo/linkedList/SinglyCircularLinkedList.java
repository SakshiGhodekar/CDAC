package com.demo.linkedList;

public class SinglyCircularLinkedList {
	
	Node head;
	public class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
			
		}
		
	}
	public SinglyCircularLinkedList() {
		head=null;
	}
	
   public void addNode(int val) {
	   Node newNode=new Node(val);
	   Node temp=head;
	   if(head==null) {
		   head=newNode;
		   newNode.next=head;
	   }else {
		   while(temp.next!=head) {
			   temp=temp.next;
		   }
		   temp.next=newNode;
		   newNode.next=head;
	   }
   }

public void displayList() {
	Node temp=head;
	
	if(head==null) {
		System.out.println("list is empty");
	}
	else {
		
	do {
		System.out.print(temp.data+"---->");
		temp=temp.next;
		}while(temp!=head);
	   
	System.out.println("head");
	
	}
	
}
public void addByPos(int pos,int val) {
	if(head==null) {
		System.out.println("list is empty");
	}
	else {
		Node newNode=new Node(val);
		
		if(pos==1) {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			head=newNode;
			temp.next=head;
		}else { 
			Node temp=head;
			int i=1;
			for(;i<=pos-2&&temp.next!=head;i++) {
				temp=temp.next;
			}
			if(i>pos-2) {
				newNode.next=temp.next;
				temp.next=newNode;
				
			}else {
				System.out.println("position is beyond the length");
			}
			
		}
	}
}

public void addByValue(int val,int num) {
	Node newNode=new Node(num);
	
	if(head.data==val) {
		newNode.next=head.next;
		head.next=newNode;
	}else {
		Node temp=head;
		
		do {
			temp=temp.next;
		}while(temp!=head&&temp.data!=val);
		
		if(temp!=head) {
			newNode.next=temp.next;
			temp.next=newNode;
		}else {
			System.out.println("value not found");
		}
	}
}

public void deleteByPos(int pos) {
	Node temp=head;
	if(head==null) {
		System.out.println("list is empty");
	}
	if(pos==1) {
		
		Node tail=head;
		while(tail.next!=head){
			tail.next=head;
		}
			if(tail==head) {
				head=null;
			}
			else {
				head=head.next;
				temp.next=null;
				tail.next=head;
				
			}
		}
	
	else {
		Node prev=null;
		int i=0;
		for(;temp.next!=head&&i<pos-1;i++) {
			prev=temp;
			temp=temp.next;
			
		}
		if(i==pos-1) {
			prev.next=temp.next;
			temp.next=null;
		}else {
			System.out.println("position not found");
		}
	}
}
}
