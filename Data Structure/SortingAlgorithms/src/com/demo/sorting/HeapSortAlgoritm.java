package com.demo.sorting;

public class HeapSortAlgoritm {
	
	public static void heapify(int[] arr  , int index , int last) {
		int left = (index*2)+1;
		int right =(index*2)+2;
		int max= index;
		if(left<last && arr[left]>arr[max]) {
			max=left;
		}
		if(right<last && arr[right]>arr[max]) {
			max=right;
		}
		
		if(max!=index) {
			swap(arr , max , index);
			heapify(arr , max , last);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		arr[j]=arr[j]+arr[i];
		arr[i]=arr[j]-arr[i];
		arr[j]=arr[j]-arr[i];	
	}

	public  static  void heapSort(int[] arr) {
		//first i have to convert a array to the maxheap
		for(int i=(arr.length/2)-1 ; i>=0  ; i--) {
			heapify(arr , i , arr.length);
		}
		
		// swap element with last and last voilate maxheap condition then again  convert arr0 to last-1 to maxheap
		
		for(int i=arr.length-1 ; i>0 ; i--) {
			swap(arr , i , 0);
			heapify(arr , 0 , i);
		}
	}
}
