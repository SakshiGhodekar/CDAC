package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSortAlgorithm;

public class TestCountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,3,7,2,5,9,5,4,3};
		int[]pos=CountingSortAlgorithm.countSort(arr);
		System.out.println(Arrays.toString(pos));

	}

}
