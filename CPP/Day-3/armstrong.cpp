#include<iostream>
using namespace std;

int main(){
    int num;
    cout<<"enter value to check armstrong no\n";
    cin>>num;
    int temp=num;
    int rem,sum=0;
    while(num!=0){
    rem=num%10;

    sum=sum+rem*rem*rem;
  
    num=num/10;
 
    }

  if(sum==temp){
    cout<<"number is armstrong no";
  }
  else{
    cout<<"number is not armstrong no";
  }


}