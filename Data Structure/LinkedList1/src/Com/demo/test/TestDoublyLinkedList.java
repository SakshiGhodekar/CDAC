package Com.demo.test;

import Com.demo.LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {
	
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(4,111);
		list.dijsplay();
	}

}
