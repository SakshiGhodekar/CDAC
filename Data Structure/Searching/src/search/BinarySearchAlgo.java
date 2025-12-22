package search;

public class BinarySearchAlgo {

	public static int BinarySearchRec(int[] arr,int low,int high, int search) {
		
		while(low<high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==search) {
				return mid;
			}if(search<arr[mid]) {
				BinarySearchRec(arr,low,mid-1,search);
			}else {
				BinarySearchRec(arr,mid+1,high,search);
			}
		}
		
		return -1;
		
	}

}
