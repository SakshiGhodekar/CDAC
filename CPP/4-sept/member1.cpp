#include<iostream>
using namespace std;
int p=3;//global variable
class Num{
    int b=3;//instance variable
    static int s;
    public:
    void fun(){
        int f=15;//local variable
        cout<<"value of f:"<<f;
    }
};
int main(){

    int a=10;
    Num n;
    n.fun();



}