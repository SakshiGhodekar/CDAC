#include<iostream>
#include<string.h>
using namespace std;
int main(){

    char str1[30]="hello world";
    char str2[]="hello \0 world";
    int len = strlen(str1);
    cout<<"length of str1 :"<<len<<endl;
    cout<<"size of str1 :"<<sizeof(str1)<<endl;
     int len1 = strlen(str2);
    cout<<"length of str2 :"<<len1<<endl;
    cout<<"size of str2 :"<<sizeof(str2);

}