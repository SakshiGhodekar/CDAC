#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char str1[20]="hello";
    char str2[50]="bye";
    strcat(str1,str2);
    cout<<str1;
}