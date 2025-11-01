package com.demo.test;
import com.demo.search.*;
import java.util.*;
public class TestArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SearchArray s=new SearchArray();
		
		int[]arr= {2,3,4,5,6,7,8,9};
		System.out.println("enter number to search");
		int num=sc.nextInt();
		//sequential search
		int pos=SearchArray.searchArray(arr,num);
		if(pos!=-1) {
			System.out.println("number found at position :"+pos);
		}else {
			System.out.println("not found");
		}
		
	   //Non Recursive Binary Search
		int pos1=SearchArray.binarySearchNonRec(arr,num);
		if(pos1!=-1) {
			System.out.println("number found at position :"+pos);
		}else {
			System.out.println("not found");
		}
		
		// Recursive Binary Search
		
		int pos3=SearchArray.binarySearchRec(arr,num,0,arr.length-1);
		
		if(pos3!=-1) {
			System.out.println("number found at position :"+pos);
		}else {
			System.out.println("not found");
		}

	}

	
}
