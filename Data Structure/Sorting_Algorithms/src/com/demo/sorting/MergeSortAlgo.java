package com.demo.sorting;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void mergeSort(int[] arr,int start,int end) {
		
		int mid=(start+end)/2;
		
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	    
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		//length of left array
		int n1=mid-start+1;
		//length of right array
		int n2=end-mid;
		
		int[]leftArray=new int[n1];
		int[]rightArray=new int[n2];
		
		
		
		for(int i=0;i<arr.length;i++) {
			leftArray[i]=arr[start+i];
		}
		for(int i=0;i<arr.length;i++) {
			rightArray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
	      while(i<n1&&j<n2) {
			if(leftArray[i]<rightArray[j]) {
				arr[k]=leftArray[i];
				k++;
				i++;
			}else {
				k++;
				j++;
			}
		}
	      while(i<n1) {
	    	  arr[k]=leftArray[i];
	    	  i++;
	    	  k++;
	      }
	      while(j<n2) {
	    	  arr[k]=rightArray[j];
	    	  j++;
	    	  k++;
	      }
	      System.out.println(Arrays.toString(leftArray));
	      System.out.println(Arrays.toString(rightArray));
		
		
	}
	

}
