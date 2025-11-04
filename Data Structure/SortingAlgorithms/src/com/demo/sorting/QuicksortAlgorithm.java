package com.demo.sorting;

public class QuicksortAlgorithm {
	public static void quicksortAsc(int[] arr) {
		quicksortHelperAsc(arr , 0 , arr.length-1);
	}

	private static void quicksortHelperAsc(int[] arr, int start, int end) {
		if(start>=end) return;
		int pivot = findPivotAsc(arr , start , end);
		quicksortHelperAsc(arr, start, pivot-1);
		quicksortHelperAsc(arr, pivot+1, end);
	}

	private static int findPivotAsc(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		while(i<j) {
			while(i<=end && arr[pivot]>=arr[i]) {
				i++;
			}
			while( arr[pivot]<arr[j]) {
				j--;
			}
			if(i<j) {
				swap(arr , i , j);
			}
		}
		swap(arr , pivot , j);
		return j;
	}
	
	public static void quicksortDesc(int[] arr) {
		quicksortDescHelper(arr , 0 , arr.length-1);
	}

	private static void quicksortDescHelper(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pivot = findPivotDesc(arr, start , end);
		quicksortDescHelper(arr, start, pivot-1);
		quicksortDescHelper(arr, pivot+1, end);
	}
	
	

	private static int findPivotDesc(int[] arr, int start, int end) {
		int pivot= arr[start];
		int i=0 ;
		int j=end;
		while(i<j) {
			while(i<=end && arr[i]>=pivot) {
				i++;
			}
			while(arr[j]<pivot) {
				j--;
			}
			if(i<j) swap(arr , i , j);
		}
		swap(arr , start , j);
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		if(i==j) return;
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		
	}
	
	
}
