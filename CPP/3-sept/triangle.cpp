#include<iostream>
using namespace std;

int main(){
    int n=5;
    for(int i=0;i<=n;i++){
        //for spaces
        for(int j=n-i;j>0;j--){
            cout<<" ";
        }
        //for *
        for(int k=n-i;k<=n;k++){
            cout<<"* ";
        }
        cout<<endl;

    }
}