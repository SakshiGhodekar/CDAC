#include <iostream>  
using namespace std; 
class Complex
{

	int real,img;
	public:
		void show();
		Complex();
		Complex(int,int);
		
};
void Complex ::show()
{
	cout<<"complex no is "<<real<<"+"<<img<<"i"<<endl;
}
Complex::Complex()
{
	cout<<"in default constructor\n";
	//real=10;
	//img=20;
	cout<<"enter value of real\n";
	cin>>real;
	cout<<"enter value of img\n";
	cin>>img;
	
}
Complex::Complex(int r,int i)
{
	cout<<"in parametrized constructor\n";
	real=r;
	img=i;
}
int main()
{
	Complex c1,c2;
	c1.show();
	c2.show();
	Complex c3(5,6);
	c3.show();
	
}


