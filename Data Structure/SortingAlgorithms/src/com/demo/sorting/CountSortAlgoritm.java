package com.demo.sorting;

import java.util.Arrays;

public class CountSortAlgoritm {
	public static int[] countSort(int[] arr) {
		int max = findMax(arr);
		
		int[] count = new int [max+1];
		//get count
		for(int i=0 ;i<arr.length ; i++) {
			count[arr[i]]+=1;
		}
		
		//getCummlativeSum
		for(int i=1 ; i<count.length ; i++) {
			count[i]+=count[i-1];
		}
		
		
		int[] ans = new int[ arr.length];
		
		for(int i=0 ; i<arr.length ; i++) {
			count[arr[i]]--;
			ans[count[arr[i]]]=arr[i];
		}
		
		return ans;
	}

	private static int findMax(int[] arr) {
		int max=arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
}
