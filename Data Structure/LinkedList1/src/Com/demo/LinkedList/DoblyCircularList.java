package Com.demo.LinkedList;

public class DoblyCircularList {
	class Node{
		int data;
		Node pre;
		Node next;
		public Node(int data) {
			this.data=data;
			pre=null;
			next=null;
		}
	}
	
	Node head;
	
	public DoblyCircularList() {
		head=null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
			
		}
		else {
			Node temp=head.pre;
			newNode.pre=temp;
		    temp.next=newNode;
		}
			head.pre=newNode;
		    newNode.next=head;
		
	}
	
	
	public void addByPosition(int pos , int val) {
		Node newNode = new Node(val);
		if(pos==1) {
			if(head==null) {
				head=newNode;
				head.pre=head;
				head.next=head;
			}else {
				Node temp = head.pre;
				newNode.pre=temp;
				temp.next=newNode;
				newNode.next=head;
				head.pre=newNode;
				head=newNode;
			}
		}
		else {
			Node temp=head;
			int i=0;
			for( ; i<pos-2 && temp.next!=head ; i++) {
				temp=temp.next;
			}
			if(i==pos-2) {
				newNode.pre=temp;
				newNode.next=temp.next;
				temp.next=newNode;
				newNode.next.pre=newNode;
			}
			else {
				System.out.println("position not found");
			}
		}
	}
	
	public void addByValue(int val , int num) {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		Node newNode = new Node(val);
		Node temp=head;
		while( temp.next!=head && temp.data!=num) {
			temp=temp.next;
		}
		if(temp.data==num) {
			newNode.pre=temp;
			newNode.next=temp.next;
			temp.next=newNode;
			newNode.next.pre=newNode;
		}
		else {
			System.out.println("position not found");
		}
	}
	
	
	public void deleteByPosition(int pos) {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		if(pos==1) {
			if(head.next==head) {
				head.next=null;
				head.pre=null;
				head=null;
			}
			else {
				Node temp=head.pre;
				head=head.next;
				head.pre.next=null;
				head.pre.pre=null;
				temp.next=head;
				head.pre=temp;
			}
		}
		else {
			Node temp=head;
			int i=0;
			for( ; i<pos-1 && temp.next!=head ; i++) {
				temp=temp.next;
			}
			if(i==pos-1) {
				temp.pre.next=temp.next;
				temp.next.pre=temp.pre;
				temp.next=null;
				temp.pre=null;
			}
			else {
				System.out.println("Position not found");
			}
		}
	}
	
	
	public void deleteByValue(int val) {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		if(head.data==val) {
			if(head.next==head) {
				head.next=null;
				head.pre=null;
				head=null;
			}
			else {
				Node temp=head.pre;
				head=head.next;
				head.pre.next=null;
				head.pre.pre=null;
				temp.next=head;
				head.pre=temp;
			}
		}
		else {
			Node temp=head;
			
			while(temp.data!=val && temp.next!=head) {
				temp=temp.next;
			}
			if(temp.data==val) {
				temp.pre.next=temp.next;
				temp.next.pre=temp.pre;
				temp.next=null;
				temp.pre=null;
			}
			else {
				System.out.println("Position not found");
			}
		}
	}
	
	
	public void displayRev() {
		if(head==null) {
			System.out.println("Empty List");
            return;		
		}
		Node temp = head.pre;
		do {
			System.out.print(temp.data+"--->");
			temp=temp.pre;
		}while(temp!=head);
		System.out.println("--->Last");
	}
	public void display() {
		if(head==null) {
			System.out.println("Empty List");
            return;		
		}
		Node temp=head;
		while(temp.next!=head) {
			System.out.print( temp.data +"--->");
			temp=temp.next;
		}
		System.out.println(temp.data+"---> HEAD");
	}
}
