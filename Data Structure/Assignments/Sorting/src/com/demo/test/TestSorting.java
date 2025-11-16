package com.demo.test;
import java.util.*;

import com.demo.entity.*;
import com.demo.sort.Sorting;

public class TestSorting {
	
	public static void addUsingMergeSort(int[] arr , int data , int length) {
		int pos = length;
		for(int i=length-1 ; i>0 ; i--) {
			if(data<arr[i]) {
				arr[pos]=arr[i];
				pos--;
			}else {
				break;
			}
		}
		
		arr[pos]=data;
			
	}
	
	public static void main(String[] args) {
//		   Employee[] students = new Employee[20];
//
//	        students[0] = new Employee(101, "Alice", 45000);
//	        students[1] = new Employee(102, "Bob", 32000);
//	        students[2] = new Employee(103, "Charlie", 51000);
//	        students[3] = new Employee(104, "David", 28000);
//	        students[4] = new Employee(105, "Eve", 39000);
//	        students[5] = new Employee(106, "Frank", 47000);
//	        students[6] = new Employee(107, "Grace", 36000);
//	        students[7] = new Employee(108, "Heidi", 43000);
//	        students[8] = new Employee(109, "Ivan", 30000);
//	        students[9] = new Employee(110, "Judy", 52000);
//	        students[10] = new Employee(111, "Karl", 41000);
//	        students[11] = new Employee(112, "Laura", 34000);
//	        students[12] = new Employee(113, "Mallory", 49000);
//	        students[13] = new Employee(114, "Niaj", 37000);
//	        students[14] = new Employee(115, "Olivia", 33000);
//	        
//	        Sorting.bubbleSort(students);
	        
//	        Sorting.heapSort(students);
	        
//	        Sorting.quickSortEmp(students);
////	        
//	        for(int i=0 ; i<students.length ; i++) {
//	        	if(students[i]==null) {
//	        		System.out.println("null");
//	               	
//	        	}else
//	        	System.out.println(students[i].toString());
//	        }
//	        
//	        Sorting.insertion(students ,  new Employee(116, "Oli", 54000));
//	        Sorting.insertion(students ,  new Employee(117, "ia", 4000));
//	        Sorting.insertion(students ,  new Employee(118, "Olivia", 45000));
//	        
//	        System.out.println("\n\n\n");
//	        
//	        for(int i=0 ; i<students.length ; i++) {
//	        	if(students[i]==null) break;
//	        	System.out.println(students[i].toString());
//	        }
//		
//		String[] stringArray = {null ,"Banana", null , "Fig", "Apple", null,"Date", "Cherry", null, "Grape", "Lemon", "Kiwi",  null,"Honeydew", "Elderberry"};
//		
//		Sorting.mergeSort(stringArray);
//		
//		System.out.println(Arrays.toString(stringArray));
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0 ; i<arr.length ; i++) {
			int data = sc.nextInt();
			addUsingMergeSort(arr, data, i);
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
}
