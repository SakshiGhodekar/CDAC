#include <iostream>
using namespace std;

int main(){

    int num;
    cout<<"enter no\n";
    cin>>num;
    int count=0;
    for(int i=1;i<=num;i++){
     
       if(num%i==0){
        count++;
       }

    }
    if(count==2){
       cout<<"number is a prime no\n"; 
    }
    else{
    cout<<"number is not a prime no\n";
    }
    // // elseif(num==0||num==1){
    // //     cout<<"number is not a prime no/n";
    // // }
    // for(int i=2;i<num-1;i++){
    //     if(num%i==0){
           
    //         break;
           
            
    //     }
        
    // }


   
}