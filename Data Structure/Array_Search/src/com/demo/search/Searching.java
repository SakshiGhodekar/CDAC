package com.demo.search;

public class Searching {
	
	public static int seqSearch(int[] arr , int target ) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==target) return i;
		}
		return -1;
	}
	
	
	public static int binarySearch(int[] arr , int target) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid = s+(e-s)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		return -1;
	}
	
	public static int binarySearchRecu(int[] arr , int target , int s , int e) {
		if(s>e) return -1;
		int mid=s+(e-s)/2;
		if(arr[mid]>target) {
			return binarySearchRecu(arr, target, s, mid-1);
		}
		return binarySearchRecu(arr, target, mid+1, e);
	}
}
