import java.util.*;
class TestArray{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("enter size of an array"); 
int size=sc.nextInt();       
int []arr=new int[size];
ArrayService.acceptData(arr);
ArrayService.displayData(arr);     
int choices;
do{
System.out.println("1.Addition of data: \n2.Find Max:\n3.Find Min:\n4.Search Number");
System.out.println("5.Find All occurances: \n6.Find nth Max:\n7.Find nth Min:\n8.exit");

System.out.println("enter choice");
choices=sc.nextInt();

switch(choices){
case 1:
int sum=ArrayService.addData(arr);
System.out.println(sum);
break;
case 2:
int Max=ArrayService.maxNumber(arr);
System.out.println(Max);
break;
case 3:
int Min=ArrayService.minNumber(arr);
System.out.println(Min)
break;
case 4:
System.out.println("Enter Number to search");
int n=sc.nextInt();
int result=ArrayService.searchNumber(arr,n);
break;
case 5:
System.out.println("Enter data to search");
int n2=sc.nextInt();
int arrpos[]=ArrayService.findAllOccu(arr,n2);
if(arrpos!=null){
System.out.println("All position are");
ArrayService.displayData(arrpos);
}else{
System.out.println("number not found");
}
break;
case 6:
System.out.println("enter the n th max ");
int n3=sc.nextInt();
int maximum=ArrayService.findNthMax(arr,n3);
break;
case 7:
System.out.println("enter the n th min ");
int n4=sc.nextInt();
int maximum=ArrayService.findNthMin(arr,n4);

break;
case 8:
System.out.println("thank you");
break;





}
}
while(choices!=8);                                   }

}






