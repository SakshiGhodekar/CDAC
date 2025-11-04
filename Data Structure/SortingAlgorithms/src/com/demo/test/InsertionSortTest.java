package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.InsertionSortAlgoritm;

public class InsertionSortTest {
	public static void main(String[] args) {
		int[] arr={4,74,45,12,7,25,22,33,56,4,22,54};
//		InsertionSortAlgoritm.insertionSortAsc(arr);
//		System.out.println(Arrays.toString(arr));
		InsertionSortAlgoritm.insertionSortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}
}
