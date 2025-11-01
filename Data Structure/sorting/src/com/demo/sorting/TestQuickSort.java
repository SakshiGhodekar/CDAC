package com.demo.sorting;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {48, 4,52,56,35,3,7,55,78};
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println( Arrays.toString(arr));
	}

}
