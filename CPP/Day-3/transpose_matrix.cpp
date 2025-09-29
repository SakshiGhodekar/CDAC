#include<iostream>
using namespace std;

int main(){
    int a[2][2]={1,2,3,4};
    
    int b[2][2];
    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
           b[i][j]=a[j][i];
        }
        cout<<endl;
    }
    for(int i=0;i<=1;i++){
        for(int j=0;j<=1;j++){
          cout<< b[i][j];
        }
        cout<<endl;
    }
    
}

