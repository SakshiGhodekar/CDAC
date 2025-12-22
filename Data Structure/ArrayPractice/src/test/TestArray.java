package test;

import java.util.Arrays;

import array2d.Array_2d;

public class TestArray {

	public static void main(String[] args) {
	 int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
	 
	 Array_2d.display(arr);
	 
	 int[] sum=Array_2d.rowwiseAdd(arr);
	 System.out.println(Arrays.toString(sum));
	 int[] sum1=Array_2d.columnwiseAdd(arr);
	 System.out.println(Arrays.toString(sum1));
	 int[] max=Array_2d.rowwiseMax(arr);
	 System.out.println(Arrays.toString(max));
	 
	 int[] max1=Array_2d.columnwiseMax(arr);
	 System.out.println(Arrays.toString(max1));

	}

}
