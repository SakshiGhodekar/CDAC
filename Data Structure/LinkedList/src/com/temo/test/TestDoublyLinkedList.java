package com.temo.test;
import com.demo.linkedList.*;
public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList lst=new DoublyLinkedList();
	    lst.addByPos(1, 770);
		lst.addNode(10);
	    lst.deleteByValue(10);
		lst.addNode(20);
		lst.addNode(40);
		lst.display();

		lst.addByPos(1, 100);
		lst.display();
		lst.addByPos(3, 300);
		lst.display();
		lst.addByPos(22, 0);
		lst.deleteByPos(7);
		lst.display();
       lst.traverseList();

	}

}
