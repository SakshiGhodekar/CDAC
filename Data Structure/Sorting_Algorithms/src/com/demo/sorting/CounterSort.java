package com.demo.sorting;

public class CounterSort {
	
	private static int findMax(int[]arr) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
		
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static int[] countSort(int[]arr) {
		
		int max=findMax(arr);
		
	   int[]count=new int[max+1];
	   //initialize count element with 0;
	   
	   for(int i=0;i<count.length;i++) {
		   count[i]=0;
	   }
	   //find occurance of an element  in count array
	   
	   for(int i=0;i<arr.length;i++) {
		   int pos=arr[i];
		   count[pos]++;
	   }
	   //commulative sum
	   
	   for(int i=1;i<count.length;i++) {
		   count[i]+=count[i-1];
	   }
	   int[]output=new int[arr.length];
	   for(int i=0;i<arr.length;i++) {
		   int pos=arr[i];
		   count[pos]--;
		   int idx=count[pos];
		   output[idx]=arr[i];
	   }
		return output;
		
		
	}

}
