package com.demo.array;
import java.util.*;
public class Array1d {
// Find addition of digits of all every individual number in the array
	public void addArray(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=findDigitSum(arr[i]);
			System.out.print(sum +" ");
		
		}
		System.out.println();
	}

	private int findDigitSum(int i) {
		int sum=0;
		while(i>0) {
			sum+=i%10;
			i=i/10;
			
		}
		return sum;
	}
	//Find factorial of only prime  numbers in the array
	public void findFact(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean prime=isPrime(arr[i]);
			
			if(prime) {
				
				int fact=factorial(arr[i]);
				System.out.print(fact+ " ");
			}
			
			
		}
		System.out.println();
		
		
	}

	private int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	private boolean isPrime(int i) {
		if(i==0&&i==1) {
			return false;
		}
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
	
	// Find maximum prime number in the array 
	
	public int maxPrime(int[]arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			boolean prime=isPrime(arr[i]);
			if(prime) {
			if(arr[i]>max) {
				max=arr[i];
			}
			}
		}
		return max;
		
	}	
//	//4. Create a copy of array, but while copying data into another array, if the number is 
//	prime and <5 then copy the reverse of the number, otherwise copy number as it is 
		
	public int[] copyArray(int []arr) {
		int[]temp = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>5 && isPrime(arr[i])) {
				int rev=reverse(arr[i]);
				
				
				temp[i]=rev;
				
			}else {
			temp[i]=arr[i];
			}
		}
		return temp;
	}

private int reverse(int i) {
	int rev=0;
	while(i>0) {
		int rem=i%10;
		rev=rev*10+rem;
		i=i/10;
	}
	return rev;
}

public void accept(String[] str) {
	Scanner sc =new Scanner(System.in);
	
	for(int i=0;i<str.length;i++) {
		String s=sc.next();
		System.out.println(s.length());
		if(s.length()<2|| i==0) {
			str[i]=s;
			continue;
		}
		char ch=s.charAt(1);
		int pos=-1;
		for(int j=i-1;j>=0;j--) {
			
				if(str[j].length()>1&&ch==str[j].charAt(1)) {
					pos=j+1;
					break;
				}
			
			
		}
		if(pos==-1) {
			str[i]=s;
			continue;
		}
		for(int j=i+1;j>pos;j--) {
			str[j]=str[j-1];
			
		}
		str[pos]=s;
		
	}
	
}


}
