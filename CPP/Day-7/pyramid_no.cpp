#include<iostream>
using namespace std;
int main(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            cout<<" ";
        }
        for(int j=i;j<2*i;j++){
            cout<<j<<" ";
        }
        for(int j=2*i-2;j>=i;j--){
            cout<<j<<" ";
        }
        cout<<endl;
    }
}