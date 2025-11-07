package com.temo.test;
import com.demo.linkedList.*;
public class TestSinglyCircularLinkedList {

	public static void main(String[] args) {
		SinglyCircularLinkedList lst=new SinglyCircularLinkedList();
   lst.addNode(10);
   lst.addNode(20);
   lst.addNode(30);
   lst.displayList();
   lst.addByPos(4, 100);
   lst.displayList();
   lst.addByValue(30, 60);
   lst.displayList();
   lst.addByValue(10, 660);
   lst.displayList();
   lst.deleteByPos(1);
   lst.displayList();
	}

}
