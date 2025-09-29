#include<iostream>
using namespace std;
int main(){
    int a[5];
    int b[3][3];
    cout<<"Accepting 1d array\n";
    for(int i=0;i<5;i++)
    {
        cin>>a[i];

    }
    cout<<endl;
    cout<<"element are\n";
    for(int i=0;i<5;i++){
        cout<<a[i]<<"\n";
    }
    cout<<endl;
    cout<<"Accepting 2d array\n";
    for(int i=0;i<3;i++){
    	for(int j=0;j<3;j++){
    		cin>>b[i][j];
		}
	
	}
	  for(int i=0;i<3;i++){
    	for(int j=0;j<3;j++){
    	cout<<b[i][j]<<"\t";
    	
		}
	   cout<<endl;
	}
}
