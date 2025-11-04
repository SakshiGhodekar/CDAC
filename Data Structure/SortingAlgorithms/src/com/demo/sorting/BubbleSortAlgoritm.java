package com.demo.sorting;

import java.util.Arrays;

public class BubbleSortAlgoritm {
	
	// bubble sort in ascending order
	public static void bubblesortAsc(int[] arr) {
		int n = arr.length;
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<n-i ; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr , j , j-1 );
				}
			}
		}
	}
	
	// bubble sort in ascending order with modified version
	public static void modifiedBubblesortAsc(int[] arr) {
		int n = arr.length;
		for(int i=0 ; i<n ; i++) {
			int count=0;
			for(int j=1 ; j<n-i ; j++) {
				if(arr[j]<arr[j-1]) {
					swap(arr , j , j+1 );
					count++;
				}
			}
			System.out.println(Arrays.toString(arr)+"---------->"+count);
			if(count==0) break;
		}
	}
	
	//bubble sort in descending order 
	public static void bubblesortDesc(int[] arr) {
		int n = arr.length;
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<n-i ; j++) {
				if(arr[j]>arr[j-1]) {
					swap(arr , j , j-1 );
				}
			}
		}
	}
	
	//bubble sort in descending order with modified version
	public static void modifiedBubblesortDesc(int[] arr) {
		int n = arr.length;
		for(int i=0 ; i<n ; i++) {
			int count=0;
			for(int j=1 ; j<n-i ; j++) {
				if(arr[j]>arr[j-1]) {
					swap(arr , j , j-1 );
					count++;
				}
			}
			System.out.println(Arrays.toString(arr)+"---------->"+count);
			if(count==0) break;
		}
	}
	
	//swapping of two number without taking third number
	private static void swap(int arr[] , int i , int j) {
		if(i==j) return ;
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		
	}
}
