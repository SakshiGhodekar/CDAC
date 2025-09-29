#include <iostream>  
using namespace std;  
#include<string.h>
int main()  
{  
   char str1[20];
   char str2[20];
   cout<<"enter string\n";
   cin>>str1;
   strcpy(str2,str1);
   strrev(str1);
   if(strcmp(str1,str2))//(strcmp(str1,str2)==0)
   cout<<"string is not palindrome";
   else
   cout<<" palindrome";
   
 
   
}  