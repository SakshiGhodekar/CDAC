#include<iostream>
#include<string.h>
using namespace std;
class Person
{
    public:
    virtual void getDetails()=0;
    virtual void getRole()=0;
    virtual ~Person(){}
};
class Student :public Person{
    private:
    int rollNo;
    string name;
    string sub[3];
    int marks[3];

    public:
    Student(int r,string n,string s[],int m[])
    {
        rollNo=r;
        name=n;
        for(int i=0;i<3;i++){
            sub[i]=s[i];
            marks[i]=m[i];
        }
    }
    void getDetails() override
    {
        cout<<"Roll no:"<<rollNo<<endl;
        cout<<"student Name :"<<name<<endl;
        cout<<"Subject choosen :";
        for(int i=0;i<3;i++)
        {
            cout<<sub[i]<<" ";
        }
        cout<<"\n";
        cout<<"Marks obtained: ";
        for(int i=0;i<3;i++)
        {
            cout<<marks[i]<<" ";
        }
        cout<<"average of marks is:"<<average()<<"\n";
    }
    void getRole() override
    {
        cout<<"Student";

    }
    double average()
    {
        double sum=0;
        for(int i=0;i<3;i++){
            sum =sum+marks[i];
        }
        return sum/3;
    }
};
class Faculty :public Person 
{
    private:
    int empId;
    string name ;
    string sub_a[2];
    public :
    Faculty(int e,string name1,string s[])
    {
    
    }
}