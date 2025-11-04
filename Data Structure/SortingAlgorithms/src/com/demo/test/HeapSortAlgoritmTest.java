package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.HeapSortAlgoritm;

public class HeapSortAlgoritmTest {
	public static void main(String[] args) {

		int[] arr = {10 , 2, 54 , 3 , 23 , 5, 656, 7,6 , 76 ,56};
		HeapSortAlgoritm.heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
