package com.demo.arrays;
import java.util.*;
public class MyArray {
	
	private int[][] arr={{1, 2 , 3,} , {4 , 5, 6} , {7 , 8 , 9}};
	
	public MyArray() {
		
	}
	public MyArray(int rows,int cols) {
		arr=new int[rows][cols];
	}

	
	
	public void displayArray() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public int[] rowwiseMax() {
		
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				temp[i]+=arr[i][j];
			}
		}
		return temp;
		
	}
	public int[] coumnwiseMax() {
		int[] temp=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			temp[i]=0;
			for(int j=0;j<arr.length;j++) {
				temp[i]+=arr[j][i];
				
			}
		}
		return temp;
		
	}
	public int[][] addArray(MyArray obj){
		int[][] temp=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i][j]=arr[i][j]+obj.arr[i][j];
			}
		}
		
		return temp;
		
	}
	public int[][] subArray(MyArray obj){
		int[][] temp=new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp[i][j]=arr[i][j]-obj.arr[i][j];
			}
		}
		
		return temp;
		
	}
	
	private void rotateUp(int rot) {
		for(int i=0 ; i<rot ; i++) {
			int[] temp = arr[0];
			for(int j=0 ; j<arr[0].length-1 ; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr[0].length-1]=temp;
		}
	}
	
	private void rotateDown(int rot) {
		for(int i=0 ; i<rot ; i++) {
			int[] temp = arr[arr[0].length-1];
			for(int j=arr[0].length-1 ; j>0 ; j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
		}
	}
	
	public void rotateRows(boolean flag , int rotation) {
		if(flag) {
			rotateUp(rotation);
			return;
		}
		rotateDown(rotation);
	}
	
	private void rotateRight(int rot) {
		for(int i=0 ; i<rot ; i++) {
			int[] temp=new int[arr.length];
			for(int j=0 ; j<temp.length ; j++) {
				temp[j]=arr[j][arr[0].length-1];
			}
			for(int j=0 ; j<arr.length ; j++) {
				for(int k=arr[0].length-1 ; k>0 ;k--) {
					arr[j][k]=arr[j][k-1];
				}
			}
			for(int j=0 ; j<temp.length ; j++) {
				arr[j][0]=temp[j];
			}
		}
	}
	
	private void rotateLeft(int rot) {
		for(int i=0 ; i<rot ; i++) {
			int[] temp=new int[arr.length];
			for(int j=0 ; j<temp.length ; j++) {
				temp[j]=arr[
				            j][0];
			}
			for(int j=0 ; j<arr.length ; j++) {
				for(int k=0 ; k<arr.length-1 ;k++) {
					arr[j][k]=arr[j][k+1];
				}
			}
			for(int j=0 ; j<temp.length ; j++) {
				arr[j][arr[0].length-1]=temp[j];
			}
		}
	}
	
	public void rotateColoumn(boolean flag ,int rot ) {
		if(flag) {
			rotateRight(rot);
			return;
		}
		rotateLeft(rot);
	}
	
	public int[][] transpose() {
		int[][]temp=new int[arr[0].length][arr.length];
		for(int i=0 ; i<arr.length ;i++) {
			for(int j=0 ; j<arr[0].length ; j++) {
				temp[j][i]=arr[i][j];
			}
		}
		return temp;
	}
	public boolean isSymmetric() {
		
		if(arr.length==arr[0].length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					if(arr[i][j]!=arr[j][i]) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
		
	}
	public boolean isIdentity() {
		if(arr.length==arr[0].length) {
			if(i==j &&)
		}
	}
}
