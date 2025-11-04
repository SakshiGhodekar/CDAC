package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.MergeSortAlgo;

public class TestMergeSort {

	public static void main(String[] args) {
		int[]arr= {2,3,5,7,2,4,9,3,4,6,7};
		int start=0;
		int end=arr.length;
        MergeSortAlgo.mergeSort(arr,start,end);
		

	}

}
