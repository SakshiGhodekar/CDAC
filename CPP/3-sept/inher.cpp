#include<iostream>
using namespace std;

class Parent{
    public:
    void run(){
        cout<<"in parent class run function";
    }
    void show(){
    cout<<"in parent class run function";
  }

};

class Child:public Parent{
    public:
    void show(){
    cout<<"in child class run function";
  }
};

int main(){
 
    Child c;
    c.show();
    c.run();
    Parent p;
    p.run();

}