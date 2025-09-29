#include<iostream>
using namespace std;
void user_strcat(char*,char*);


int main(){
   
    char str1[20]= "hello";
    char str2[30]="world";
   user_strcat(str1,str2);
    cout<<"concatination of string is\t"<<str1;
    
}
    void user_strcat(char *s2,char *s1){
        while(*s2 != '\0')
            s2++;
        
            while(*s1 !='\0'){
                *s2=*s1;
                s1++;
                s2++;
            }
            *s1='\0';
        
    
}





