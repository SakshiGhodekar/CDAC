package com.demo.sorting;

public class MergeSortAlgoritm {
	
	public static void mergeSortAsc(int[] arr) {
		mergeSortAscHelper(arr , 0 , arr.length-1);
	}

	private static void mergeSortAscHelper(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start>=end) return;
		int mid=start +(end-start)/2;
		mergeSortAscHelper(arr, start, mid);
		mergeSortAscHelper(arr, mid+1, end);
		merge(arr , start , mid , end);
	}
	
	private static void merge(int[] arr , int s , int m , int e) {
		int[] arr1 = new int[m-s+1];
		int[] arr2=new int[e-m];
		
		for(int i=0 ; i<arr1.length ; i++) {
			arr1[i]=arr[s+i];
		}
		
		for(int i=0 ; i<arr2.length ; i++) {
			arr2[i]=arr[m+1+i];
		}
		int i=0 ;
		int j=0 ; 
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr[s+k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[s+k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			arr[s+k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr[s+k]=arr2[j];
			j++;
			k++;
		}
	}
}
