package com.demo.search;

public class SearchString {
	//Sequential search
	public static int searchString(String[]arr,String search) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(search)) {
				return i;
			}
		}
		return -1;
		
	}
	//Non Recursive Binary search
	public static int binarySearchNonRec(String[]arr,String search) {
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(arr[mid].equals(search)) {
				return mid;
			}
			if(search.compareTo(arr[mid])<0) {
				high=mid-1;
			}else  {
				low=mid+1;
			}
		}
		return -1;
}	
	//Recursive Binary search
	public static int binarySearchRec(String[]arr,String search,int low,int high) {
	
	 if(low<=high) {
		 int mid=(low+high)/2;
		 
		 if(arr[mid].equals(search)) {
			 return mid;
		 }
		 if(search.compareTo(arr[mid])<0) {
			 return binarySearchRec(arr,search,low,mid-1);
		 }
		 return binarySearchRec(arr,search,mid+1,high);
	 }
	return -1;
	
}

}
