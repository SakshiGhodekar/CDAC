package com.demo.test;
import java.util.Arrays;

import com.demo.array.*;
public class Test1dArray {

	public static void main(String[] args) {
		
		int [] arr= {1,37,54,5,73,5,7};
		Array1d ar1=new Array1d();
		ar1.addArray(arr);
		
		ar1.findFact(arr);
		int max=ar1.maxPrime(arr);
		System.out.println(max);
		int[]ans=ar1.copyArray(arr);
		System.out.println(Arrays.toString(ans));
		
		String[] str=new String[20];
		ar1.accept(str);

   System.out.println(Arrays.toString(str));
		
	}

	

}
