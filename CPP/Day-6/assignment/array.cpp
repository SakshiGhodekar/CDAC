#include<iostream>
using namespace std;

int main(){
    int size;
    cout<<"enter size of an array"<<endl;
    cin>>size;
     int arr[size];
     cout<<"enter"<<size<<"elements\n";
     for(int i =0;i<size;i++){
        cin>>arr[i];
     }
     int largest = arr[0];
     for(int i=1;i<size;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
     }
     int secondLarge;
     int i;
     for( i=0;i<size;i++){
        if(arr[i]<largest){
            secondLarge=arr[i];
            break;                                                                                    
        }
     }
     if(i==size){
        cout<<"no second largest element found"<<endl;

     }
     for(int j=0;j<size;j++){
        if(arr[j]<largest && arr[j]>>secondLarge){
            secondLarge=arr[j];
        }
     }
     cout<<"second largest element is: "<<secondLarge<<endl;
    }
