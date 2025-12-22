package test;

import search.BinarySearchAlgo;

public class TestBinarySerachAlgo {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9,12,43};
		
		int pos=BinarySearchAlgo.BinarySearchRec(arr,0,arr.length-1,10);
		if(pos==-1) {
			System.out.println("not found");
		}else {
		System.out.println("val found at pos"+ pos);
		}
	}

}
