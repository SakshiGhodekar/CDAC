#include<iostream>
using namespace std;

class Student{
    int roll;
    char name[20];

    public:
    void accept(){
        cin>>roll;
        cin>>name;
    }
    void display(){
        cout<<"roll no:"<<roll<<"name :"<<name<<"\n";
    }
    ~Student(){
        cout<<"destructor called\n";
    }
};
int main(){
    int n,i;
    cout<<"enter no of student \n";
    cin>>n;
   Student* ptr=new Student[n];
    cout<<"accept student details\n";
    for(i=0;i<n;i++){
        ptr[i].accept();
    }
    cout<<"display:\n";
    for(i=0;i<n;i++){
        ptr[i].display();
    }
    delete []ptr;
}