package com.demo.sorting;

public class QuickSort {
	public static void quickSort(int[] arr , int s, int e ) {
		if(s>=e) {
			return;
		}
		int pivot = findPivot(arr , s , e );
		quickSort(arr , pivot+1 , e);
		quickSort(arr ,s , pivot-1);
	}
	
	private static int findPivot(int[] arr , int s , int e) {
		int i=s;
		int pivot=s ;
		int j=e;
		while(i<=j) {
			while(i<=e && arr[i]<=arr[pivot]) i++;
			while(j<=e && arr[j]>arr[pivot]) j--;
			if(i<j) swap(arr , i , j);
		}
		swap(arr , j , pivot);
		return j;
	}
	
	private static void swap(int[] arr, int i, int j) {
		if(i==j) return;
	    arr[j] = arr[i] + arr[j];
	    arr[i] = arr[j] - arr[i];
	    arr[j] = arr[j] - arr[i];
	}
}
