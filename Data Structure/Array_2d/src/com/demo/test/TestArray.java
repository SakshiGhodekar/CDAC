package com.demo.test;
import java.util.Arrays;

import com.demo.arrays.*;
public class TestArray {

	public static void main(String[] args) {
		MyArray obj=new MyArray();
		System.out.println("Accept Array");
		obj.displayArray();
		System.out.println();
		int[][] ans=obj.transpose();
		
		
	}

}
