package com.temo.test;
import com.demo.queue.*;
public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue cqueue=new CircularQueue(5);
		cqueue.enQueue(10);
		cqueue.enQueue(20);
		cqueue.enQueue(30);
		cqueue.enQueue(40);
		cqueue.enQueue(50);
		cqueue.enQueue(50);
		cqueue.deQueue();
		cqueue.deQueue();
		cqueue.deQueue();
		cqueue.deQueue();
		cqueue.deQueue();
		

	}

}
