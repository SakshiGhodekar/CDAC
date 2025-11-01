package com.demo.search;

public class SearchArray {
  //sequential search
	public static int searchArray(int[]arr,int search) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
		
	}
	//Non Recursive Binary search
	public static int binarySearchNonRec(int[]arr,int search) {
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid]==search) {
				return mid;
			}
			if(search<arr[mid]) {
				high=mid-1;
			}else  {
				low=mid+1;
			}
		}
		return -1;
		
		
	}
	//Recursive Binary search
	public static int binarySearchRec(int[]arr,int search,int low,int high) {
		
		 if(low<=high) {
			 int mid=(low+high)/2;
			 
			 if(arr[mid]==search) {
				 return mid;
			 }
			 if(search<arr[mid]) {
				 return binarySearchRec(arr,search,low,mid-1);
			 }
			 return binarySearchRec(arr,search,mid+1,high);
		 }
		return -1;
		
	}
	
	
}
