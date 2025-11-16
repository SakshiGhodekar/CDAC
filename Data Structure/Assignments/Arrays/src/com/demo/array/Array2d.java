package com.demo.array;

public class Array2d {
	
	// to reverse rows in the array
	public  static int[][] reverseRows(int[][] arr ){
		int[][] temp = new int[arr.length][arr[0].length];
		for(int i=0 ; i< arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				temp[i][arr.length-1-j] = arr[i][j];
			}
		}
		return temp;
	}
	
	public static void display(int arr[][]) {
		for(int i=0 ; i< arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int[] findMaxOddInRows(int[][] arr) {
		int[] temp = new int[arr.length];
		for(int i=0 ; i< arr.length ; i++) {
			int min=Integer.MIN_VALUE;
			for(int j=0 ; j<arr[0].length ; j++) {
				if(arr[i][j]%2!=0) {
					if(arr[i][j]>min) {
						min=arr[i][j];
					}
				}
			}
			temp[i]=min;
		}
		return temp;
	}
	
	public static int findRowAddAvg(int[][] arr) {
		int sum =0 ;
		for(int i=0 ; i<arr.length ; i++) {
			int curRowSum=0;
			for(int j=0 ; j<arr[0].length ; j++) {
				curRowSum+=arr[i][j];
			}
			System.out.println("sum of ith row="+curRowSum);
			sum+=curRowSum;
		}
		return sum/arr[0].length;
	}
	
	
	public static int findColsAddAvg(int[][] arr) {
		int[] temp= new int[arr[0].length];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				temp[j]+=arr[i][j];
			}
		}
		
		int sum = 0;
		for(int j=0 ; j<arr[0].length ; j++) {
			sum+= temp[j];
			 System.out.println(temp[j]);
		}
		return sum/arr.length;
	}
}
