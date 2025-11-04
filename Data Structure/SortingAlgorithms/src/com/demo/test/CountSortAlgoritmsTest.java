package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountSortAlgoritm;

public class CountSortAlgoritmsTest {
	public static void main(String[] args) {
		int[] arr= {4,5,2,4,5,2,6,4,5,6,3,2,1,4,5,2,3,9,8,7,4,5,2,5};
		int[] ans =CountSortAlgoritm.countSort(arr);
		System.out.println(Arrays.toString(ans));
	}
	
}
