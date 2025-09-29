#include<iostream>
#include<string.h>
using namespace std;

class Emp{
   string name;
   int roll;
   public:
    void details(){
        cin>>name;
        cout<<name;

    }
    void details(string a,int b){
    name=a;
     roll=b;
     cout<<a;
     cout<<b;
    }
};
// class Child{

// };

int main(){
  
    Emp e;
    e.details();
    e.details("saskshi",12);
}