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
     cout<<"enter roll no,name,DOB,marks\n";
     cin>>rollNo>>name>>DOB>>marks;
    }
    void display(){
        cout<<rollNo<<" "<<name<<" "<<DOB<<" "<<marks<<endl;
        }
};

 int main(){
   student s[10];
   int n=10;
   cout<<"enter details of 10 students\n";
   for(int i=1;i<=n;i++){
    s[i].input();
   }
   cout<<"display details of students\n";
   for(int i=1;i<=n;i++){
    s[i].display();
   }

}