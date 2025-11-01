package com.demo.arrays;

import java.util.Arrays;

public class MyArray {

private int[] arr;
private int count;
public MyArray() {
	arr=new int[10];
	count=0;
}
public MyArray(int arr[],int count) {
	this.arr=arr;
	this.count=count;
}
public MyArray(int size) {
	arr=new int[size];
	count=0;
	
}
public boolean add(int x) {
	if(count<arr.length) {
		arr[count]=x;
		count++;
		return true;
	}
	return false;
	
}
public boolean add(int value,int pos) {
	
	if(count<arr.length && pos<=count) {
		for(int i=count;i<pos;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[pos]=value;
		count++;
		return true;
	}
	return false;
	
}
public int searchByValue(int x) {
	
	for(int i=0;i<count;i++) {
		if(arr[i]==x) {
			return i;
		}
	}
	return -1;
	
}
public boolean deleteByPos(int pos) {
	
	if(pos<count) {
		for(int i=pos;i<count-1;i++) {
		arr[i]=arr[i+1];
		
		}
		count--;
		arr[count]=0;
		return true;
	}
	return false;
	
}
public boolean deleteByValue(int value) {
	int idx=searchByValue(value);
	if(idx!=-1) {
		return deleteByPos(idx);
		
	}
	
	return false;
	
}
public void rotateArray(boolean flag,int num) {
	if(flag) {
		for(int cnt=0;cnt<num;cnt++) {
			int temp=arr[count-1];
			for(int i=count-1;i>=1;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
	}else {
		for(int cnt=0;cnt<num;cnt++) {
			int temp=arr[0];
			for(int i=0;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[count-1]=temp;
		}
	}
}
public int[] reverseArray(boolean flag) {
	
	if(true) {
		for(int i=0,j=count-1;i<j;i++,j--) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		return arr;
	} 
		
		int[] arr1=new int[count];
		for(int i=0,j=count-1;i<count;i++,j--) {
			arr1[i]=arr[j];
		}
		return arr1;
		
}
public int findMax() {
	if(count==0) {
		return -1;
	}
  int max=arr[0];
  
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]>max) {
		  max=arr[i];
	  }
  }
	return max;
	
}
public int[] exchangeIndexByValue() {
	
	int max=findMax();
	if(max==-1) {
		return null;
	}
	int[] newArr=new int[max+1];
	for(int i=0;i<newArr.length;i++) {
		newArr[i]=-1;
	}
	
	for(int i=0;i<count;i++) {
		newArr[arr[i]]=i;
		
	}
	
	return newArr;
	
}
@Override
public String toString() {
	return "MyArray [arr=" + Arrays.toString(arr) + ", count=" + count + "]";
}


}
