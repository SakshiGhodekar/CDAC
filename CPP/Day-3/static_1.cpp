#include<iostream>
using namespace std;
void show();
int a=4; //global
static int x=2; //static global
int main(){
       static int y;//local static
       static int a=2;
       cout<<a<<endl;
       cout<<x<<endl;
       show();
}
      void show(){

       int a =0;//local
       cout<<a<<endl;
       int x = 0;
       cout<<x<<endl;
        x++;  
       cout<<x<<endl;
       
  
    
    
}