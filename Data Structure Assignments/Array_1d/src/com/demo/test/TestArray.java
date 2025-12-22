package com.demo.test;

import java.util.Arrays;

import com.demo.array.Array_1d;

public class TestArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(arr));
//		Array_1d ar= new Array_1d();
		int sum=Array_1d.add(arr);
		System.out.println("sum is"+sum);
		
		//find fact of only prime number in array
		Array_1d.fact(arr);
		

	}

}
