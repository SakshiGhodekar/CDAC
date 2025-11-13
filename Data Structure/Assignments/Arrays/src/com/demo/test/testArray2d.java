package com.demo.test;

import java.util.Arrays;

import com.demo.array.Array2d;

public class testArray2d {
	public static void main(String[] args) {
		int arr[][] = {
				{1 ,2 , 3, 4} ,
				{5 , 6, 7, 8 } ,
				{ 9 , 10 , 11 , 12 } ,
				{13 , 14 , 15 , 16}};
		
		int[][] temp=Array2d.reverseRows(arr);
		Array2d.display(temp);
		int[] maxOdds = Array2d.findMaxOddInRows(arr);
		System.out.println(Arrays.toString(maxOdds));
		int avgSum = Array2d.findColsAddAvg(arr);
		System.out.println(avgSum);
	}
	
}
