import java.util.Scanner;
class Factorial
{

public static int Factorial(int n){
int f=1;
for(int i=1;i<=n;i++)
{
f= f*i;
}
return f;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans =Factorial(n);
System.out.println(ans);
}
}