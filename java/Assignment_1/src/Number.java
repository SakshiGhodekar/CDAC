import java.util.*;
class Number{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		
		ArrayNumbers.acceptData(arr);
		ArrayNumbers.displayData(arr);
		int choice;
		
		do {
			System.out.println("1:display prime numbers\n 2.Addition of non prime numbers");
			System.out.println("3.factorial of number \n4.Nth Maximum prime number\n5.Nth minimum prime number ");
			
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
			   System.out.println("prime number are:");
			   int[]res=ArrayNumbers.PrimeCheck(arr);
			   System.out.println(res);
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("thank you");
			}
		}
		while(choice!=8);
		
		
	}
}
