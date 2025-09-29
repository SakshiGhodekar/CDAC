#include<iostream>
using namespace std;

int main(){
    int a[2][2]={1,2,3,4};
    int b[2][2]={5,6,7,8};
    int c[2][2];
    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
           c[i][j]=a[i][j]+b[i][j];
        }
        cout<<endl;
    }
    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
          cout<< c[i][j];
        }
        cout<<endl;
    }
    
}