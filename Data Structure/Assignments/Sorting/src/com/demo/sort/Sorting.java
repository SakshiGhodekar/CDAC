package com.demo.sort;

import com.demo.entity.Employee;

public class Sorting {
	
	public static void bubbleSort(Employee[] arr) {
		for(int i=0 ; i<arr.length ;  i++) {
			for(int j=1 ; j<arr.length-i ; j++) {
				if(arr[j]==null) continue;
				if(arr[j-1].compareTo(arr[j])>0) {
					Employee temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void insertion(Employee[] arr , Employee s) {
		int size=0;
		for(int i=0 ; arr[i]!=null && i<arr.length ; i++) {
			size++;
		}
		if(size==arr.length) {
			System.out.println("Cant add. Array is full");
			return;
		}
		int pos = 0;
		for(int i=size ; i>0 ; i-- ) {
			if(arr[i-1].compareTo(s)>0) {
				arr[i]=arr[i-1];
			}else {
				pos=i;
				break;
			}
		}
		arr[pos]=s;
	}
	
	
	public static void mergeSort(String[] arr) {
		mergeSort(arr , 0 , arr.length-1);
	}

	private static void mergeSort(String[] arr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr , start , mid);
			mergeSort(arr , mid+1 , end);
			merge(arr , start , mid , end);
		}
		
	}

	private static void merge(String[] arr, int start, int mid, int end) {
		// TODO Auto-generated method stub
		String[] left = new String[(mid-start)+1];
		String[]  right = new String[end-mid];
		
		for(int i=0 ; i<left.length ; i++) {
			left[i]=arr[start+i];
		}
		
		for(int i=0 ; i<right.length ; i++) {
			right[i]=arr[mid+1+i];
		}
		
		int i=0;
		int j=0 ;
		int k=start;
		
		while(i<left.length && j<right.length) {
			while(i<left.length && left[i]==null) {
				i++;
			}
			while(j<right.length && right[j]==null) {
				j++;
			}
			if(i<left.length && j<right.length && left[i].compareTo(right[j])<=0) {
				arr[k]=left[i];
				i++;
				k++;
			}
			else if (i<left.length && j<right.length && left[i].compareTo(right[j])>=0){
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		
		while(i<left.length) {
			while(i<left.length && left[i]==null) {
				i++;
			}
			if(i<left.length) {
				arr[k]=left[i];
				i++;
				k++;
			}
		}
		
		while(j<right.length) {
			while(j<right.length && right[j]==null) {
				j++;
			}
			if(j<right.length) {
				arr[k]=right[j];
				j++;
				k++;
			}
		}	
		
		while(k<=end) {
			arr[k]=null;
			k++;
		}
	}
	
	
	public static void quickSort(String[] arr ) {
		quickSort(arr , 0 , arr.length-1);
	}

	private static void quickSort(String[] arr, int start, int end) {
		if(start<end) {
			int pivot = findpivot(arr , start , end);
			quickSort(arr , start , pivot-1);
			quickSort(arr , pivot+1 , end );
		}
	}

	private static int findpivot(String[] arr, int start, int end) {
		int i=start; 
		int j=end;
		int pivot = start;
		
		while(i<j) {
			while(i<end && arr[i]!=null && arr[i].compareTo(arr[pivot])<=0) {
				i++;
			}
			while(j>start && (arr[j]==null || arr[pivot]!=null && arr[j].compareTo(arr[pivot])>0)){
				j--;
			}
			if(i<j) {
				String temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		String temp = arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		return j;
	}
	
	public static void heapSort(Employee[] arr) {
		for(int i=(arr.length-1)/2 ; i>=0 ; i--) {
			heapify(arr , i , arr.length);
		}
		
		for(int i=arr.length-1 ; i>0 ; i--) {
			Employee temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr , 0 , i);
		}
	}

	private static void heapify(Employee[] arr, int i, int length) {
		int left = (i*2)+1;
		int right =(i*2)+2;
		int pos=i;
		if( arr[pos]!=null && left<length && (arr[left]==null  || arr[left].compareTo(arr[i])>=0)) {
		    pos=left;	
		}
		if( arr[pos]!=null && right<length && (arr[right]==null || arr[right].compareTo(arr[pos])>=0)) {
			pos=right;
		}
		
		if(pos!=i) {
			Employee temp = arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			heapify(arr , pos , length);
		}
		
	}
	
	
	public  static void quickSortEmp(Employee[] emp) {
		quickSort(emp , 0 , emp.length-1);
	}

	private static void quickSort(Employee[] emp, int start, int end) {
		if(start<end) {
			int pivot = findPivot1( emp , start , end);
			quickSort(emp , start , pivot);
			quickSort(emp , pivot+1 , end);
		}
		
	}

	private static int findPivot1(Employee[] emp, int start, int end) {
		int i=start ;
		int j = end ;
		while(i<j) {
			while(i<end && emp[i]!=null && emp[start]!=null &&emp[i].compareTo(emp[start])<=0) {
				i++;
			}
			while(j>start && emp[j]==null || emp[start]!=null && emp[j].compareTo(emp[start])>0) {
				j--;
			}
			if(i<j) {
				Employee temp = emp[i];
				emp[i]=emp[j];
				emp[j]=temp;
			}
		}
		Employee temp = emp[start];
		emp[start]=emp[j];
		emp[j]=temp;
		return j;
	}
	
	
}
