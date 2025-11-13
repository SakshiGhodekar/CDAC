package com.demo.test;

import com.demo.circularqueue.CircularQueue;

public class CircularQueueTest {
	public static void main(String[] args) {
		CircularQueue q= new CircularQueue(5);
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.insert(6);  // full
		q.display();
		
		System.out.println(q.delete());
		System.out.println(q.delete());
		
		System.out.println("------");
		q.display();
		
		
		System.out.println("------");
		System.out.println("------");
		
		
		q.insert(5);
		q.insert(6);
		
		q. display();
		
		System.out.println("------");
		System.out.println("------");
		
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.display();
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.display();
		System.out.println(q.delete());
		System.out.println(q.delete());
		q.display();
		
	}
}
