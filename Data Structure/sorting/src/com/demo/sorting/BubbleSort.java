package com.demo.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=1 ; j<arr.length-i ; j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
//	private static void swap(int arr[] , int i , int j) {
//		int temp = arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//	}
	
//	public static void bubbleSortModified(int arr[] ) {
//		for(int i=0 ; i<arr.length ; i++) {
//			int count=0 ;
//			for(int j=1 ; j<arr.length-i ; j++) {
//				if(arr[j-1]>arr[j]) {
//					swap(arr , j-1 , j);
//					count++;
//				}
//			}
//			System.out.println(Arrays.toString(arr)+"------>"+count);
//			if(count==0) break;
//		}
//	}
}
