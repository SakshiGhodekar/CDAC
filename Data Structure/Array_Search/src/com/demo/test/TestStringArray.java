package com.demo.test;
import java.util.*;

import com.demo.search.SearchString;
public class TestStringArray {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		String[]str= { "a" , "b" , "c" ,"d" , "e" , "f" , "g"};
		System.out.println("enter string to search:");
		String s=sc.next();
		//Sequential search
		
		int pos=SearchString.searchString(str,s);
		if(pos!=-1) {
			System.out.println("string found at position:"+pos);
		}else {
			System.out.println("not found");
		}
		
		//Non Recursive binary search
		
		int pos2=SearchString.binarySearchNonRec(str,s);
		if(pos2!=-1) {
			System.out.println("string found at position:"+pos2);
		}else {
			System.out.println("not found");
		}
       //Recursive Binary Search
		int pos1=SearchString.binarySearchRec(str,s,0,str.length-1);
		if(pos1!=-1) {
			System.out.println("string found at position:"+pos1);
		}else {
			System.out.println("not found");
		}

	}

}
