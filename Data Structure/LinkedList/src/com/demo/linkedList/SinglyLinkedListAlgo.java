package com.demo.linkedList;

public class SinglyLinkedListAlgo {
	Node head;
	 
   public class Node{
	    int data;
	    Node next;
	   
	    public Node(int x) {
	    	data=x;
	    	next=null;
	    }
   }
   
  public void addNode(int value) {
	  Node newNode=new Node(value);
	  if(head==null) {
		  head=newNode;
	  }else {
		  Node temp=head;
		  while(temp.next!=null) {
			  temp=temp.next;
		  }
		  temp.next=newNode;
	  }
	    
  }
  
  public void displayList() {
	  if(head==null) {
		  System.out.println("empty list");
	  }else {
		  for(Node temp=head;temp!=null;temp=temp.next) {
			  System.out.print(temp.data+"--->");
		  }
		  System.out.println("null");
	  }
  }
  public void addNewPos(int value,int pos) {
	  Node newNode=new Node(value);
	  if(pos==1) {
		 newNode.next=head;
		 head=newNode;
	  }else {
		  Node temp=head;
		  
		  for(int i=1;i<=pos-2&&temp!=null;i++) {
			  temp=temp.next;
			  
		  }
		  if(temp!=null) {
			  newNode.next=temp.next;
			  temp.next=newNode;
		  }
		  else {
			  System.out.println(" pos is beyond the length of list");
		  }
	  }
	 
	  
  }
  public void addValue(int value , int data) {
	  Node newNode=new Node(data);
	  Node temp=head;
	  while(temp!=null&&temp.data!=value) {
		  temp=temp.next;
	  }
	  if(temp!=null) {
		  newNode.next=temp.next;
		  temp.next=newNode;
		  
	  }else {
		  System.out.println("Value not found");
	  }
  }
}
