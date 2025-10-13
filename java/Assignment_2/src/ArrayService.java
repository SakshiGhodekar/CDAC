
public class ArrayService {

	
	public static void display(int[][]arr) {
		
		System.out.println("elements of an array are :");
		for(int i=0;i<arr.length;i++) {
	      for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+"\t");
	}
	      System.out.println();    
	}
	}
	
	//addition of numbers
	public static int addAllNum(int[][]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		return sum;
	}
	
	//Add row wise
	
	public static int[] addRowwise(int[][]arr){
		
		int[]temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=0;
			for(int j=0;j<arr.length;j++) {
				temp[i]+=arr[i][j];
			}
		}
		
		return temp;
	}
	
	//add column wise
	
	public static int[] addColumnwise(int[][]arr) {
		
		int[] temp=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			 temp[i]=0;
			for(int j=0;j<arr.length;j++) {
				
				temp[i]+=arr[j][i];
			}
		}
		return temp;
		
	}
	
	//Max of all number;
	
	public static int maxNumber(int [][]arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			
		}
		return max;
	}
	
	// row wise max no
	
	public static int[] rowMaxNumber(int [][]arr) {
		
		int[]temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int max=arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					
				}
			} 
			
			temp[i]=max;
		}
		return temp;
			
		}
		
		public static int[] colMaxNumber(int[][]arr) {
			
			int[] temp=new int[arr[0].length];
			
			for(int i=0;i<arr[0].length;i++) {
				int max=arr[0][0];
				for(int j=0;j<arr.length;j++) {
					if(arr[j][i]>max) {
						max=arr[j][i];
					}
				}
				temp[i]=max;
			}
			return temp;
		}
		
		public static int[][] add2dArray(int[][]arr,int[][]arr1){
			
			int [][]temp=new int[arr.length][arr.length];
			 for(int i=0;i<arr.length;i++) {
	    		 for(int j=0;j<arr[i].length;j++) {
	    			temp[i][j]=arr[i][j]+arr1[i][j];
	    		 }
	    	 }
			 return temp;
		}
public static int[][]mult2dArray(int[][]arr,int[][]arr1){
			
			int [][]temp=new int[arr.length][arr[0].length];
			 for(int i=0;i<arr.length;i++) {
	    		 for(int j=0;j<arr[i].length;j++) {
	    			 for(int k=0;k<arr[i].length;k++)
	    			temp[i][j]+=arr[i][k]*arr1[k][j];
	    		 }
	    	 }
			 return temp;
		}

public static int[][]transpose2dArray(int[][]arr,int[][]arr1){
	int [][]temp=new int [arr[0].length][arr.length];
	for(int i=0;i<arr[0].length;i++) {
		for(int j=0;j<arr.length;j++) {
		 temp[i][j]=arr[j][i];
		}
	
	}
		return temp;
}

public static boolean identity(int[][]arr){
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			if((i==j) && (arr[i][j]!=1)) {
				return false ;
			}
			else if((i!=j) && (arr[i][j]!=0)){
				return false;
			}
		}
		
	}
	return true;
}

public static int[][] rotateRow(int[][] arr,int n) {
	
	int[][] temp=new int[arr.length][arr[0].length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			temp[i][j]=arr[i][j];
		}
	}
	int[] temp1 = temp[0];
	for(int i=0;i<temp.length-1;i++) {
		temp[i]=temp[i+1];
	}
	temp[temp.length-1]=temp1;
	
	return temp;
}

public static int[][] rotateColumn(int[][] arr, int n) {
	
	int[][] temp=new int[arr.length][arr[0].length];
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		temp[i][j]=arr[i][j];
	}
	}
	int[] temp1=new int[temp.length];
	for(int i=0;i<temp1.length;i++) {
		temp1[i]=temp[i][temp[0].length-1];
	}
	for(int i=0;i<temp.length;i++) {
		for(int j=temp[0].length-2;j>=0;j--) {
			temp[i][j+1]=temp[i][j];
		}
	}
	
	for(int i=0;i<temp.length;i++) {
		temp[i][0]=temp1[i];
	}
	return temp;
			
}

public static int[] convertTo1DArray(int[][] arr) {
	int[] temp=new int[arr.length*arr[0].length];
	int cnt=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			temp[cnt]=arr[i][j];
			cnt++;
		}
	}

	return temp;
}



	}

