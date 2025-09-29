#include <iostream>
using namespace std;
int main(){
    int n;
    int fact=1;
    cout<<"enter number\n";
    cin>>n;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }

    cout<<"factorial of no is \t"<<fact;

}