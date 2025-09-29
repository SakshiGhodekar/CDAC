//  Write a Student class and use it in your program. Store the data of 10 students and display
//  the sorted data according to their roll numbers, dates of birth, and total marks

#include<iostream>
using namespace std;
class student{
    public:
    int rollNo;
    string name;

    string DOB;
    int marks;

    void input(){
     cout<<"enter roll no : ";
     cin>>rollNo;
      cout<<"enter NAME : ";
     cin>>name;
      cout<<"enter DOB : ";
     cin>>DOB;
      cout<<"enter TOTAL MARKS : ";
     cin>>marks;
    }
    void display(){
        cout<<rollNo<<"\t"<<name<<"\t"<<DOB<<"\t"<<marks<<endl;
        }

        
};

 int main(){
   student s[10];
   
   cout<<"enter details of 10 students\n";
   for(int i=0;i<10;i++){
    cout<<"\n student :"<<i+1<<":\n";
    s[i].input();
   }
   for(int i=0;i<10;i++){
    for (int j=i+1;j<10;j++){
        if(s[i].rollNo>s[j].rollNo){
            swap(s[i],s[j]);
        }
    }
   }
   cout<<"display details of students\n";
   for(int i=0;i<10;i++){
    s[i].display();
   }
 
   }


