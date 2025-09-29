#include<iostream>
using namespace std;
class Circle
{
    public:
        int r;
        int compute_area()
        {
            return 3.14*r*r;
        }
};
int main()
{
    Circle obj;
    obj.r=2;
    cout<<"Radius is :"<<obj.r <<"\n";
    cout<<"Area is :"<<obj.compute_area();
    return 0;
}
 
