import java.util.Scanner;
class Function
{

public int Factorial(int n){
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
 Function f=new Function();
int ans = f.Factorial(n);
System.out.println(ans);
}
}