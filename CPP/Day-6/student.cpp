//  Write a Student class and use it in your program. Store the data of 10 students and display
//  the sorted data according to their roll numbers, dates of birth, and total marks

#include<iostream>
using namespace std;
class student{
    public:
    int rollNo;
    string name;

    int date,m,y;
    int marks;

    void input(){
     cout<<"enter roll no,name,DOB,marks\n";
     cin>>rollNo>>name>>date>>m>>y>>marks;
    }
    void display(){
        cout<<rollNo<<" "<<name<<" "<<date<<"-"<<m<<"-"<<y<<" "<<" "<<marks<<endl;
        }

        void sortbyRoll(student s[],int n){
            for(int i=0;i<n-1;i++){
                for(int j=j+1;j<n;j++){
                   

                    
                }
            }

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
//    for(int i=0;i<10;i++){
//     for(int j=i+1;j<=10;j++){
//         if(s[i]>s[j]){
//             int temp=s[i];
//             s[i]=s[j];
//             temp=s[j];

//         }
//     
   }


