import java.util.*;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[][]= {{1,2,3},{3,4,5},{2,3,4}};
		int arr1[][]= {{5,4,3},{4,8,5},{7,8,4}};
		ArrayService.display(arr);
		ArrayService.display(arr1);
		
	   int choice;
	    
	   do {
		   System.out.println("1.Add all no\n2.Add rowwise\n3.Add Column wise");
		     System.out.println("4.Find max OF all no\n5.Maximum rowwise\n6.maximum columnwise");
		     System.out.println("7.Add 2 arrays\n8.Multiply Array\n9.Find transpose\n10.Check identity matrix");
		     System.out.println("11.rotate matrix rowwise\n12.Rotate matrix columnwise");
		     System.out.println("13.Convert 1d array");
		     System.out.println("14.Exit");
		     System.out.println("enter choice");
		     choice=sc.nextInt();
		     
		     switch(choice) {
		     
		     case 1:
		    	int add= ArrayService.addAllNum(arr);
		    	System.out.println("Addition is :"+add);
		    	 break;
		    
		     case 2:
		    	 int[]arrAdd=ArrayService.addRowwise(arr);
		    	 for(int val:arrAdd) {
		    		 System.out.println(val);
		    	 }
		    	 break;
		     case 3:
		    	 int[]Add=ArrayService.addColumnwise(arr);
		    	 for(int val:Add) {
		    		 System.out.println(val);
		    	 }
		    	 break;
		     case 4:
		    	 int max=ArrayService.maxNumber(arr);
		    	 System.out.println("Maximum no is:"+max);
		    	 break;
		     case 5:
		    	 int []Rowmax=ArrayService.rowMaxNumber(arr);
		    	 for(int var:Rowmax) {
		    	 System.out.println(var);
		    	 }
		    	 break;
		     case 6:
		    	 int[]col=ArrayService.colMaxNumber(arr);
		    	 for(int val:col) {
		    		 System.out.println(val);
		    	 }
		    	 break;
		     case 7:
		    	 int[][]addition=ArrayService.add2dArray(arr,arr1);
		    	 for(int i=0;i<addition.length;i++) {
		    		 for(int j=0;j<addition[i].length;j++) {
		    			 System.out.print(addition[i][j]+"\t");
		    		 }
		    		 System.out.println();
		    	 }
		    	 break;
		     case 8:
		    	 int[][]Multiply=ArrayService.mult2dArray(arr,arr1);
		    	 for(int i=0;i<Multiply.length;i++) {
		    		 for(int j=0;j<Multiply[i].length;j++) {
		    			 System.out.print(Multiply[i][j]+"\t");
		    		 }
		    		 System.out.println();
		    	 }
		    	 break;
		     case 9:
		    	 int [][]Transpose=ArrayService.transpose2dArray(arr,arr1);
		    	 for (int i=0;i<Transpose[0].length;i++) {
		    		 for (int j=0;j<Transpose.length;j++)
		    		 {
		    			 System.out.print(Transpose[i][j]+"\t");
		    		 }
		    		 System.out.println( );
		    	 }
		    	 break;
		     case 10:
		    	boolean status=ArrayService.identity(arr);
		    	if(status)
		    	{
		    		System.out.println("Identity Matrix ");
		    	}
		    	else
		    	{
		    		System.out.println("Not Identity Matrix");
		    	}
		    	
		    	 break;
		     case 11:
		    	 System.out.println("Enter number of rotation");
					int n=sc.nextInt();
					int[][] newarr=ArrayService.rotateRow(arr,n);
					 for (int i=0;i<  newarr.length;i++) {
			    		 for (int j=0;j< newarr.length;j++)
			    		 {
			    			 System.out.print( newarr[i][j]+"\t");
			    		 }
			    		 System.out.println( );
			    	 }
					break;
		    
		     case 12:
		    	 System.out.println("Enter number of rotation for column");
					n=sc.nextInt();
					int [][]newarr1=ArrayService.rotateColumn(arr,n);
					 for (int i=0;i<  newarr1.length;i++) {
			    		 for (int j=0;j< newarr1.length;j++)
			    		 {
			    			 System.out.print( newarr1[i][j]+"\t");
			    		 }
			    		 System.out.println( );
			    	 }
		    	 
		    	 break;
		     case 13:
		    	 
		    	 int[] arr2=ArrayService.convertTo1DArray(arr);
					for(int val:arr2) {
						System.out.print(val+",");
					}
					System.out.println();
					break;
		    
		    	 
		    default:
		    	System.out.println("exit successfully");
		     }
	   }while(choice!=14);
	}

}
