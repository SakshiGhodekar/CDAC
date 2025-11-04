package com.demo.sorting;

public class InsertionSortAlgoritm {
	public static void insertionSortAsc(int[] arr) {
		for(int i=1 ; i<arr.length ; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	
	public static void insertionSortDesc(int[] arr) {
		for(int i=1 ; i<arr.length ; i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
