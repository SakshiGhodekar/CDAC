package com.demo.myArr1D;

import java.util.Arrays;

public class MyArr1D<T> {
	private Object[] arr;
	int  size;
	
	//default constructor creating array of size 10
	public MyArr1D() {
		arr = new Object[10];
		size =0;
	}
	
	//paramatrise constructor accepting size and create array of size 
	public MyArr1D(int size) {
		arr = new Object[size];
		size =0;
	}
	
	//get the current size of the array
	public int getSize() {
		return size;
	}
	
	//get capacity of the array
	public int getCapacity() {
		return arr.length;
	}
	
	//to add value at the end index of the array
	public boolean add(T value) {
		if(size<arr.length) {
			arr[size++]=value;
			return true;
		}
		return false;
	}
	
	// add at position
	public boolean add(T value , int position) {
		if(size<arr.length && position <= size) {
			for(int i=size ; i>position ; i--) {
				arr[i]=arr[i-1];
			}
			arr[position]=value;
			size++;
			return true;
		}
		return false;
	}
	
	//add at index 0
	public boolean addAtFrist(T val) {
		return add(val , 0);
	}
	
	//search by value
	public int searchByValue(T value) {
		for(int i=0 ; i<size ; i++) {
			if(arr[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	//delete at last postion
	public boolean delete() {
		if(size>0) {
			arr[--size]=0;
			return true;
		}
		return false;
	}
	
	//delete by position
	public boolean delete(int position) {
		if(position<=size) {
			for(int i=position ; i<size-1 ; i++) {
				arr[i]=arr[i+1];
			}
			arr[--size]=null;
			return true;
		}
		return false;
	}
	
	//deleteByValye
	public boolean deleteByValue(T value) {
		int index = searchByValue(value);
		if(index!=-1) {
			return delete(index);
		}
		return false;
	}
	
	//to rotate right
	private void rotateRight(int s , int e , int rot) {
		int cnt=s;
		while((e-cnt)>rot) {
			for(int i= rot-1 ; i>=0; i--) {
				Object temp=arr[cnt];
				arr[cnt]=arr[size-1-i];
				arr[size-1-i]= temp;
				cnt++;
			}
		}
		if((e-cnt)>(rot/2) && (e-cnt)!=rot) {
			rotateRight(cnt , e , rot-(e-cnt));
		}
	}
	
	// to rotate left
	private void rotateLeft(int s , int e , int rot) {
		int cnt=e-1;
		while(cnt>rot) {
			for(int i=rot-1 ; i>=0 ; i--) {
				Object temp=arr[i];
				arr[i]=arr[cnt];
				arr[cnt]=temp;
				cnt--;
			}
		}
		if(cnt>(rot/2) && cnt!=rot) {
			rotateLeft(s , cnt , rot-cnt);
		}
	}
	
	//rotate array right if flag is true else rotate aray left
	public void rotate(boolean flag , int rot) {
		if(flag) {
			rotateRight(0 , size , rot);
			return ;}
		rotateLeft(0 , size , rot);
	}
	
	// if flag is true reverse array in place
	public Object[] reverseArray(boolean flag) {
		if(flag) {
			int s=0 ;
			int e=size-1;
			while(s<e) {
				Object temp = arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
			return arr;
		}
		Object[] temp = new Object[size];
		for(int i=0 ; i<size; i++) {
			temp[size-1-i]=arr[i];
		}
		return temp;
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
	
}