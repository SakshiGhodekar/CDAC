#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char str[10]="hello";
    char str1[10];

    int len=strlen(str)-1;
     int y=0;
     while(len>=0){
        str1[y]=str[len];
        len--;
        y++;
     }
     str1[y]='\0';
     cout<<str1;    
}