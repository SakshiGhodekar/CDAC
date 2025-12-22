package com.demo.array;

public class Array_1d {
 public static int add(int[]arr) {
	 int sum=0;
	 for(int i=0;i<arr.length;i++) {
		 sum+=arr[i];
	 }
	return sum;
	 
 }

 public static void fact(int[] arr) {
	 for(int i=0;i<arr.length;i++) {
		 boolean isPrime=primecheck(arr[i]);
		 if(isPrime) {
			 int fact=factorial(arr[i]);
			 System.out.print(fact +" ");
		 }
	 }
	 System.out.println();
 }

 private static int factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	return fact;
}

 private static boolean primecheck(int num) {
	if(num==0||num==1) {
		return false;
	}
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
 }
}
