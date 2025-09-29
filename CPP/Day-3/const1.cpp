#include <iostream>
using namespace std;
 class Complex{
    int real ,img;
    public :
    Complex();
    Complex(int,int);
    void display()const;
    void setReal(int);
    int getReal() const;


};
Complex::Complex()
{
    cout<<"\ndefault constructor\n";
    real=1;
    img=2;
}
void Complex::display()const{
    cout<<"complex number  "<<real<<"+"<<img<<"i"<<endl;
}
Complex::Complex(int r,int q)
{
    cout<<"in parameter constructor\n";
    real =r;
    img=q;
}
void Complex::setReal(int q)
{
    real=q;
}
int Complex::getReal()const{
    return real;
}
int main(){
   
   cout<<" \n using constant fuction\n";
    Complex d1;
    d1.display();
    const Complex d2(6,7);
    d2.display();
    // d2.setReal(50);
    // d2.display();
    cout<<"real part"<<d2.getReal();
}


// #include<iostream>
// using namespace std;
// void accept();
// void display();

// class Student{
// int num;
//  char name;
//  //constructor call
  
//     private :Student();
//     public:
//      void accept(){
      
//             cout<<"enter any value\n";
//             cin>>num;
       
//         cout<<"enter name\n";
//         cin>>name;
//     }
//      void display(){
//      cout<<"number is\n";
//      cout<<num<<endl;
//      cout<<"name is\n";
//      cout<<name<<endl;
//     } 
// };

// int main(){
//     int num;
//     char name;
//     //constructor call
   
//    Student s;
//     s.accept();
//     s.display();
// };