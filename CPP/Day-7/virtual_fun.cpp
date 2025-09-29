
//case 1: object creation on stack with out virtual keyword

#include<iostream>
using namespace std;
class employee{
    int id;
    public:
     employee();
     employee(int);
     void display();
     int findSal(){
        return 0;
     }

};
employee::employee(){
    cout<<"in def of emp \n";
    id=0;
};
employee::employee(int i){
    cout<<"in para of emp\n";
    id=i;
};
void employee::display(){
    cout<<" id of an emp is"<<id<<endl;
}

class wageemployee:public employee{
int hrs,rate;
public:
  wageemployee();
  wageemployee(int,int,int);
  void display();
  int findSal();
};
wageemployee::wageemployee(){
    cout<<"in default of wage\n";
	hrs=0;
	rate=0;
}
wageemployee::wageemployee(int i,int h,int r)	:employee(i)
{
	cout<<"in para of wage\n";
	hrs=h;
	rate=r;
}
int wageemployee::findSal()
{
	return hrs * rate;
}
void wageemployee::display()
{
	employee::display();
	cout<<hrs<<endl;
	cout<<rate<<endl;
}
int main(){
    employee*ptr;
    wageemployee we(101,4,500);
    ptr=&we;
    cout<<"salary is"<<ptr->findSal();
    ptr->display();

}
