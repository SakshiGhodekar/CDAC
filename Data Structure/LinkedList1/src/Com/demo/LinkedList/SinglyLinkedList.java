package Com.demo.LinkedList;

public class SinglyLinkedList {
	
	private Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	public SinglyLinkedList() {
		head = null;
	}
	
	 public void add(int value) {
		 Node newNode = new Node(value);
		 if(head==null) {
			 head= newNode;
		 }
		 else {
			 Node temp = head;
			 while(temp.next!=null) {
				 temp=temp.next;
			 }
			 temp.next= newNode;
		 }
	 }
	 
	 public void add(int index , int value) {
		 Node newNode = new Node(value);
		 if(index==1) {
			 newNode.next = head;
			 head=newNode;
		 }else {
			 Node temp=head;
			 for(int i=0 ; temp!=null && i<index-2 ; i++) {
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 newNode.next=temp.next;
				 temp.next=newNode;
			 }
			 else {
				 System.out.println("Invalid index. List size is less.");
			 }
		 }
	 }
	 
	 public void addAfter(int nodeData , int value) {
		 Node newNode = new Node(value);
		 Node temp =  head;
		 while(temp!=null && temp.data!=nodeData) {
			 temp=temp.next;
		 }
		 if(temp!=null) {
			 newNode.next = temp.next;
			 temp.next=newNode;
		 }else {
			 System.out.println("this Element not present in the list");
		 }
	 }
	 
	 public void delete(int index) {
		 if(head==null) {
			 System.out.println("Empty List cant delete the value");
			 return;
		 }
		 if(index<=0) {
			 System.out.println("Index should be greter than 1");
			 return;
		 }
		 if(index==1) {
			 head=head.next;
		 }else {
			 Node prev=null;
			 Node temp = head;
			 for(int i=0 ; temp!=null && i<index-1 ; i++) {
				 prev=temp;
				 temp = temp.next;
			 }
			 if( temp!=null) {
				 prev.next=temp.next;
				 temp.next=null;
			 }
			 if(temp==null) {
				 System.out.println("Index is larger than length");
			 }
		 }
	 }
	 
	 
	 public void deleteByValue(int val) {
		 Node temp = head;
		 if(head!=null && head.data==val) {
			 head=head.next;
			 temp.next=null;
		 }
		 else {
			 Node prev = null;
			 while(temp!=null && temp.data!=val) {
				 prev=temp;
				 temp=temp.next;
			 }
			 if(temp!=null) {
				 prev.next = temp.next;
				 temp.next = null;
			 } else {
				 System.out.println("Element not found");
			 }
		 }
	 }
	 
	 public int findLength() {
		 if(head==null) return 0;
		 int length=0;
		 Node temp = head;
		 while(temp!=null) {
			 temp=temp.next;
			 length++;
		 }
		 return length;
	 }
	 
	 
	 public void reverse() {
		 
	 }
	 
	 
	 public void display() {
		 Node temp = head;
		 while(temp!=null) {
			 System.out.print(temp.data+"--->");
			 temp=temp.next;
		 }
		 System.out.println("NULL");
	 }

}
