#include<iostream>
using namespace std;
int main() 
{ 
    int arr[] = { 1, 2, 3, 4 }; //Array define 
  
    int* ptr = arr; //pointer define
    cout << "Memory address of arr: " << &arr << endl; //print adress using array name 
    cout << "Memory address of arr: " << ptr << endl; //print address using pointer
  
    return 0; 
}