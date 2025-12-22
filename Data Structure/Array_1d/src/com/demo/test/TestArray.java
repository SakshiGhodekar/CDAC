package com.demo.test;
import java.util.Arrays;

import com.demo.arrays.*;
public class TestArray {

	public static void main(String[] args) {
		MyArray obj=new MyArray();
		obj.add(1);
		obj.add(3);
		obj.add(5);
		System.out.println(obj);
		System.out.println(obj.add(6,3));
		System.out.println(obj);
		obj.add(4);
		System.out.println(obj);
		System.out.println("value found at position :"+obj.searchByValue(5));
//		obj.deleteByPos(2);
//		System.out.println(obj);
//		obj.deleteByValue(66);
//		System.out.println(obj);
//		obj.rotateArray(true, 2);
//		System.out.println(obj);
//		obj.rotateArray(false, 2);
//		System.out.println(obj);
//		obj.reverseArray(true);
//		System.out.println(obj);
//		obj.reverseArray(false);
//		System.out.println(obj);
//		obj.exchangeIndexByValue();
		System.out.println(Arrays.toString(obj.exchangeIndexByValue()));
	}

}
