package com.demo.test;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.demo.sorting.BubbleSort;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] arr = {15,15,14,1,45,2,45,25,78,12,48};
		BubbleSort.bubbleSortModified(arr);
		System.out.println(Arrays.toString(arr));
	}

}
