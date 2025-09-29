#include <iostream>
using namespace std;

void swap(int*,int*);//pass by address


void swap(int*p,int*q){
    int temp;
    temp=*p;
    *p=*q;
    *q=temp;
     cout<<"swapping in pass by address\n";
    cout<<"p= "<<*p<<"q="<<"\t"<<*q;
}


int main()
{

        int a=10,b=20;
        cout<<"before swapping \n";
        cout<<"a="<<a<<"\t"<<"b="<<b;
       
        swap(&a,&b);
        

        cout<<"after swapping\n";

       cout<<"a="<<a<<"\t"<<"b="<<b;
    
}
