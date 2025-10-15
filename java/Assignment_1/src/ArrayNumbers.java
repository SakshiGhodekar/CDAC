import java.util.Scanner;

public class ArrayNumbers {

	public static void acceptData(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
	}

///display data
public static void displayData(int arr[]) {
	System.out.println("Element are :");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
}

//prime numbers in an array
public static int[] PrimeCheck(int arr[]) {
	
	int temp[]=new int[arr.length];
	
	for(int i=0;i<arr.length;i++) {
		temp[i]=-1;	
}

	for(int i=0;i<arr.length;i++) {
	  temp[i]=prime(arr[i]);	
	}
	return temp;
}

public static int prime(int n) {
	int count=0;
	for(int i=0;i<n;i++) {
		if(i%2==0) {
			count++;
	
		}
	}
	if(count>=2) {
		return n;
	
}
	return n;
}	
	
}

//public static boolean isPrime(int[]arr) {
//  
//	for(int i=2;i<arr.length;i++) {
//		if(arr[i]%2==0) {
//			return false;
//		}
//	}
//	return true;
//}
//
//}


