package Com.demo.test;

import Com.demo.LinkedList.SinglyLinkedList;

public class SinglyLinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.display();
		list.add(4, 100);
		list.add(18 , 200);
		list.add(7 , 200);
		list.addAfter(100 , 100);
		list.display();
		list.delete(1);
		list.delete(21);
		list.delete(9);
		list.display();
		System.out.println(list.findLength());
	}
}
