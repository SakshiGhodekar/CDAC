package com.demo.sorting;

public class SelectionSortAlgorithm {
	public static void selectionSortAsc(int[] arr) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			int minIndex = findMinIndex(arr , i );
			if(minIndex!=i) {
				swap(arr , i , minIndex);
			}
		}
	}
	
	public static void selectionSortDesc(int[] arr) {
		for(int i=0 ; i<arr.length-1 ; i++) {
			int minIndex = findMaxIndex(arr , i );
			if(minIndex!=i) {
				swap(arr , i , minIndex);
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		if(i==j) return;
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		
	}

	private static int findMinIndex(int[] arr, int start) {
		int min = start;
		for(int i=start+1 ; i<arr.length ; i++) {
			if(arr[min]>arr[i]) min=i;
		}
		return min;
	}
	
	private static int findMaxIndex(int[] arr, int start) {
		int max = start;
		for(int i=start+1 ; i<arr.length ; i++) {
			if(arr[max]<arr[i]) max=i;
		}
		return max;
	}
	
}
