#include<iostream>
using namespace std;
 void add(int a, char b)
{
    cout<<"sum = "<<(a+b);
} 
 void add(int a,int b)
{
    cout<<endl<<"sum = "<<(a+b);
} 
void add(double a,double b)
{
    cout<<endl<<"sum = "<<(a+b);
}
 int main()
{
    add('A','B');
    add(true,false);
    add(1.2f,1.2f);
 }
