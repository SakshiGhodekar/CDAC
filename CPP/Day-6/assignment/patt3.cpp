#include<iostream>
using namespace std;

int main(){
    cout<<"enter number of rows\n";
    int rows;
    cin>>rows;
    char c='A';
    for(int i =1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            cout<<c<<" ";
            c++;
        }
        cout<<endl;
    }
}