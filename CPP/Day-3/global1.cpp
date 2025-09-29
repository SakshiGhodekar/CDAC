#include<iostream>
using namespace std;
void show();
int y=10;//global
int main(){
cout<<y<<endl;
y++;//11
show();
cout<<y<<endl;

}
void show(){
    cout<<y<<endl;
    int x=0;
    cout<<x<<endl;
    x++;
    cout<<x<<endl;
}