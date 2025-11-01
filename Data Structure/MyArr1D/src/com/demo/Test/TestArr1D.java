package com.demo.Test;
import com.demo.myArr1D.MyArr1D;

public class TestArr1D {
	public static void main(String[] args) {
		MyArr1D<Integer> ob= new MyArr1D();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.add(6);
		ob.add(7);
		ob.rotate(false , 4);
		System.out.println(ob);
	}
}
