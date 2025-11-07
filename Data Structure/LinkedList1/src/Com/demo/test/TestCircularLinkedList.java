package Com.demo.test;

import Com.demo.LinkedList.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.deleteByValue(1);
		list.display();
	}

}
