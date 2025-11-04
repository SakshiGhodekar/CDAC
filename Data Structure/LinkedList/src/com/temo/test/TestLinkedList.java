package com.temo.test;
import com.demo.linkedList.*;
public class TestLinkedList {

	public static void main(String[] args) {
	SinglyLinkedListAlgo list1=new SinglyLinkedListAlgo();
	list1.displayList();
	list1.addNode(10);
	list1.addNode(30);
	list1.addNode(40);
	list1.displayList();
	list1.addNode(60);
	list1.displayList();
	list1.addNewPos(100, 5);
	list1.displayList();
	list1.addNewPos(22, 6);
	list1.displayList();
	list1.addNewPos(11, 10);
	list1.displayList();
	list1.addValue(30);
	list1.displayList();
	
	}

}
