package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.BubbleSortAlgoritm;

public class BubbleSortAlgorithmTest {
	public static void main(String[] args) {
		int[] arr = {4,74,45,12,7,25,22,33,56,4,22,54};
//		int[] arr= {1,2,3,4};
//		BubbleSortAlgoritm.bubblesortAsc(arr);
//		System.out.println(Arrays.toString(arr));
//		BubbleSortAlgoritm.modifiedBubblesortAsc(arr);
//		BubbleSortAlgoritm.bubblesortDesc(arr);
//		System.out.println(Arrays.toString(arr));
		BubbleSortAlgoritm.modifiedBubblesortDesc(arr);
	}
}
