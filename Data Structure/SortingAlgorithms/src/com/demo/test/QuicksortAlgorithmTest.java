package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.QuicksortAlgorithm;

public class QuicksortAlgorithmTest {
	public static void main(String[] args) {
		int[] arr={4,74,45,12,7,25,22,33,56,4,22,54};
//		QuicksortAlgorithm.quicksortAsc(arr);
//		System.out.println(Arrays.toString(arr));
		QuicksortAlgorithm.quicksortDesc(arr);
		System.out.println(Arrays.toString(arr));
	}
}
