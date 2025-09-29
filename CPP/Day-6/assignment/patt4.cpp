#include<iostream>
using namespace std;

int main(){
    cout<<"enter number of rows\n";
    int rows;
    cin>>rows;
    char c='A';
    for(int i =1;i<=rows;i++){
        for(int j=1;j<=i;j++){
           if(i%2==0){
            cout<<c<<" ";
            c++;
           }else{
            cout<<i<<" ";
           }
        }
        cout<<endl;
    }
}