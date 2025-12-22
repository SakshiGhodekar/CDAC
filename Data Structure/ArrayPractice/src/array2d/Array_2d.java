package array2d;

public class Array_2d {
 public static void display(int[][]arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }

 public static int[] rowwiseAdd(int[][] arr) {
	 int[] temp=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		temp[i]=0;
		for(int j=0;j<arr[i].length;j++) {
			temp[i]+=arr[i][j];
		}
	}
	return temp;
 }
 public static int[] columnwiseAdd(int[][]arr) {
	 
	 int[] temp=new int[arr[0].length];
	 for(int i=0;i<arr[0].length;i++) {
		 temp[i]=0;
		 for(int j=0;j<arr.length;j++) {
			 temp[i]+=arr[j][i];
		 }
	 }
	return temp;
	 
 }
 
 public static int[] rowwiseMax(int[][]arr) {
	 int [] temp=new int[arr.length];
	 
	 for(int i=0;i<arr.length;i++) {
		 int max=0;
		 for(int j=0;j<arr[0].length;j++) {
			 if(arr[i][j]>max) {
				 max=arr[i][j];
			 }
			 temp[i]=max;
		 }
	 }
	return temp;
	 
 }
 public static int[] columnwiseMax(int[][]arr) {
	 int [] temp=new int[arr[0].length];
	 
	 for(int i=0;i<arr[0].length;i++) {
		 int max=0;
		 for(int j=0;j<arr.length;j++) {
			 if(arr[j][i]>max) {
				 max=arr[j][i];
			 }
			 temp[i]=max;
		 }
	 }
	return temp;
	 
 }
 
 public boolean isIdentity(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr.length==arr[0].length) {
					if(i==j&&arr[i][j]!=1) {
						return false;
					}else if(i!=j&&arr[i][j]!=0) {
						return false;
					}else {
						return true;
					}
				}
				
			}
		}
		return true;
	}
 
}
