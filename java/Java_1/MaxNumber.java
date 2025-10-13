import java.util.Scanner;
class MaxNumber{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 number :");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
if(n1==n2 && n1==n3)
{
System.out.println("equal number");
}
else {
if(n1>n2 && n1>n3)
{
System.out.println("n1 is greatest");
}
else if(n2>n1 && n2>n3)
{
System.out.println("n2 is greatest");
}
else{
System.out.println("n3 is greatest");
}
}
}}