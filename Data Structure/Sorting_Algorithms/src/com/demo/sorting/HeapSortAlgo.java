package com.demo.sorting;
import java.util.Arrays;
public class HeapSortAlgo {
	
public static void heapSortAscending(int[] arr) {
	 //covert tree into maxheap
	for(int i=(arr.length/2)-1;i>=0;i--) {
		heapify(arr,arr.length,i);
	}
	
	int n=arr.length;
	for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		//reconvert tree into max heap
		heapify(arr,i,0);
	}
	
}

private static void heapify(int[] arr, int n, int i) {
	int left=2*i+1;
	int right=2*i+2;
	int largest=i;
	if(left<n&&arr[left]>arr[largest]) {
		largest=left;
	}
	if(right<n&&arr[right]>arr[largest]) {
		largest=right;
	}
	if(largest!=i) {
		int temp=arr[largest];
		arr[largest]=arr[i];
		arr[i]=temp;
		
		heapify(arr,n,largest);
	}
	System.out.println(Arrays.toString(arr));
	
}


}
