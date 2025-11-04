package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CounterSort;

public class TestCounterSort {

	public static void main(String[] args) {
		int [] arr= {2,3,7,1,3,8,9,2,3,5,6};
		int[]ans=CounterSort.countSort(arr);
		System.out.println(Arrays.toString(ans));

	}

}
