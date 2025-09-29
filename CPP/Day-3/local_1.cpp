#include<iostream>
using namespace std;
void show();
int a=4; //global
int x=2;
int main(){
    int a=4;//local
    int x=2;
     show();
}
    void show(){

       int a =0;//local
       cout<<a<<endl;
       int x = 0;
   
       cout<<x<<endl;
           a=0;
       cout<<a<<endl;
       
  
    

    
}