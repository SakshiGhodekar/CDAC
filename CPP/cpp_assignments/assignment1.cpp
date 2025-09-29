#include <iostream>
using namespace std;

class Cdate{

int dd,mm,yy;

public:

void accept();
void display();
void setDd(int);
int getMm();


};
void Cdate::accept(){
    cout<<"accept day, month and year\n";
    cin>>dd>>mm>>yy;
}

void Cdate::display(){
    cout<<"date is \t"<<dd<<"\t"<<mm<<"\t"<<yy<<endl;
}

void Cdate::setDd(int d){
    dd=d;

}
int Cdate::getMm(){
    return mm;
}
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

    Cdate c1;
    c1.accept();
    c1.display();
    c1.setDd(4);
    cout<<" \t month is"<<c1.getMm();
   cout<<endl;
   
   cout<<" \n using constant fuction\n";
    Complex d1;
    d1.display();
    const Complex d2(6,7);
    d2.display();
    // d2.setReal(50);
    // d2.display();
    cout<<"real part"<<d2.getReal();
}
