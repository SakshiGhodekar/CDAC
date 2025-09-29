#include<iostream>
using namespace std;
//find 2nd largest no

int main(){
    int n;
    cout<<"enter array size\n";
    cin>>n;
    int arr[n];
    int max;
    int sec;
    cout<<"enter array element\n";
    for(int i=0;i<n;i++){
       
        cin>>arr[i];
    }
    max=arr[0];
    sec=max;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            sec=max;
            max=arr[i];
        }else if(sec>max&&sec !=max){
            sec=arr[i];

        }
    }
     
    cout<<" max is"<<max<<endl;
     cout<<" sec_max is"<<sec;
}
