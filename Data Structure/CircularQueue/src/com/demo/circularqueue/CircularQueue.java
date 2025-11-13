package com.demo.circularqueue;

public class CircularQueue {
	int[] arr;
	int start =-1;
	int end=0;
	
	public CircularQueue(){
		arr = new int[10];
	}
	
	public CircularQueue(int size) {
		arr = new int[size];
	}
	
	public boolean isFull() {
		return start==end;
	}
	
	public boolean isEmpty() {
		return start==-1;
	}
	
	public boolean insert(int data) {
		if(!isFull()) {
			if(start==-1) {
				start=0;
			}
			arr[end]=data;
			end=(end+1)%arr.length;
			return true;
		}
		System.out.println("full");
		return false;
	}
	
	public int delete() {
		if(!isEmpty()) {
			int val = arr[start];
			start=(start+1)%arr.length;
			if(start==end) {
				start=-1;
				end=0;
			}
			return val;
		}
		System.out.println("Empty");
		return -1;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}
		int stop = start>=end?(arr.length+end):end;
		
		for(int i=start ; i<stop ; i++) {
			System.out.print(arr[(i)%arr.length]+", ");
				
		}
		System.out.println();
	}
}
