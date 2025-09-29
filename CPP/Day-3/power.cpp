#include<iostream>
using namespace std;
int main(){
    int p,n,power=1;
    
   cout<<"enter the no \n";

    cin>>n;
    cout<<"enter the power\n";
    cin>>p;

    for(int i=1;i<=p;i++){
     
        power=power*n;
      
    }
   cout<<"power of number is\t"<<power;
}