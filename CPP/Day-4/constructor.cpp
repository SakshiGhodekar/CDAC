#include<iostream>
using namespace std;

void funct(int a,bool flag=true)
{
    if(flag ==true)
    {
        cout<<"flag is true ,a"<<a;
    }
    else{
        cout<<"flag is false,a/n"<<a;
    }
}
int main()
{
    funct(200,false);
}