#include<iostream>
using namespace std;
class A{
    public:
        int sum;
        A();
        A(int,int=0);
        void print()
        {
            cout<<"sum="<<sum<<endl;
        }
};
A::A(int a,int x)
{
    sum=a+x;
}
int main()
{
    A(10,20);
    A obj2(5);
    A obj1(5);

}