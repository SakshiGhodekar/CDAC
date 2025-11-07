package Com.demo.LinkedList;

public class CircularLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	
	public CircularLinkedList() {
		head=null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp = head ;
			do {
				temp = temp.next;
			}while(temp.next!=head);
			
			temp.next = newNode;
		}
		newNode.next = head;
	}
	
	public void addByPosition(int position , int value) {
		Node newNode = new Node(value);
		if(position==1) {
			if(head==null) {
				head=newNode;
				newNode.next=head;
				return; 
			}
			Node temp = head;
			do {
				temp=temp.next;
			}while(temp.next!=head);
			newNode.next=head;
			head=newNode;
			temp.next = head;
		}
		else {
			Node temp=head;
			int i=0 ;
			for( ; i<position-2 && temp!=null && temp.next!=head ; i++) {
				temp=temp.next;
			}
			if(i==position-2) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Index out of bounce");
			}
		}
	}
	
	
	public void addByValue(int value , int data) {
		Node newNode = new Node(value);
		Node temp=head;
		do {
			temp=temp.next;
		}while(temp!=head && temp.data!=data);
		if(temp.data==data) {
			newNode.next=temp.next;
			temp.next=newNode;
		}else {
			System.out.println("value not found");
		}
	}
	
	public void deleteByPosition( int position) {
		if(head==null) {
			 System.out.println("Empty List");
		     return;
		}
		if(position==1) {
			if(head.next==head) {
				head.next=null;
				head=null;
				return;
			}
			
			Node temp = head;
			Node x= head;
			
			do {
				temp=temp.next;
			}while(temp.next!=head);
			
			head=head.next;
			x.next=head;
			temp.next=head;
		}
		else {
			Node pre=null;
			Node temp=head;
			int i=0;
			for(i=0 ; temp.next!=head &&  i<position-1 ; i++) {
				pre = temp;
				temp=temp.next;
			}
			if(i==position-1) {
				pre.next=temp.next;
				temp.next = null;
			}else {
				System.out.println("Position out of bounce");
			}
		}
	}
	public void deleteByValue(int  value) {
		if(head==null) {
			System.out.println("Empty List");
			return;
		}
		if(head.data==value) {
			if(head.next==head) {
				head.next=null;
				head=null;
				return;
			}
			Node temp = head;
			Node x= head;
			
			do {
				temp=temp.next;
			}while(temp.next!=head);
			
			head=head.next;
			x.next=head;
			temp.next=head;
		}else {
			Node pre=null;
			Node temp=head;
			int i=0;
			for(i=0 ; temp.next!=head &&  temp.data!=value ; i++) {
				pre = temp;
				temp=temp.next;
			}
			if(temp.data==value) {
				pre.next=temp.next;
				temp.next = null;
			}else {
				System.out.println("Position out of bounce");
			}
		}
	}
	
	
	
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		do {
			System.out.print(temp.data +"--->");
			temp=temp.next;
		}while(temp.next!=head);
		System.out.println(temp.data+"---->" );
	}
	
}
