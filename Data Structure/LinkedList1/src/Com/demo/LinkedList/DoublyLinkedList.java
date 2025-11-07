package Com.demo.LinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node pre;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList() {
		head=null;
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			newNode.pre=temp;
			temp.next=newNode;
		}
	}
	
	public void add(int pos , int value) {
		Node newNode = new Node(value);
		if(pos==1) {
			newNode.next=head;
			if(head!=null) {
				head.pre = newNode;
			}
			head=newNode;
		}
		else {
			Node temp=head;
			for(int i=0 ; i<pos-2  && temp!=null;  i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.pre=temp;
				newNode.next=temp.next;
				temp.next=newNode;
				if(newNode.next !=null) {
					newNode.next.pre= newNode;
				}
			}
			else {
				System.out.println("wrong Position");
			}
		}
	}
	
	public void deleteByPosition(int pos) {
		if(pos==1) {
			head=head.next;
			if(head!=null) {
				head.pre.next=null;
				head.pre=null;
			}
		}
		else {
			Node temp = head;
			for(int i=0 ; i<pos-1 && temp!=null ; i++) {
				temp=temp.next;
			}
		}
	}
	
	public void dijsplay() {
		Node temp = head;
		while(temp != null ) {
			System.out.print(temp.data+"---->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}
