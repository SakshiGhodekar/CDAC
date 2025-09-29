#include<iostream>
using namespace std;
int main(){
    int a,n,power=1;
    cout<<"enter the power\n";
    cin>>a;
   cout<<"enter the no \n";

    cin>>n;

    for(int i=1;i<=a;i++){
     
        power=power*n;
      
    }
   cout<<"power of number is"<<power;
}