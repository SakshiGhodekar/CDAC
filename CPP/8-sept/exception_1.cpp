// //divide by zero
#include<iostream>
using namespace std;
int main()
{
    int x,y;
    cin>>x>>y;

    try{
        if (y==0)
        throw"Divide by zero is not possible";
        int z=x/y;
        cout<<z<<endl;
    }
    catch(const char*e)
    {
        cout<<"Exception Occured :"<<e<<endl;
    }

};
// // negative array
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"enter array element";
    cin>>n;
    try{
        if(n<0)
        throw invalid_argument("array cant be negative ");

    int *arr=new int[n];
    cout<<n<<"successfully"<<endl;
    delete []arr;    
    }

    catch(exception &e){
        cout<<"exception occured"<<e.what()<<endl;
    }
}

// // bank insufficientfund

#include<iostream>
using namespace std;
int main(){
    double bankbalanced=5000;
    double withdrawl=6000;
    try{
        if(withdrawl>bankbalanced)

        throw"Insufficient_fund";

        bankbalanced-=withdrawl;("Sufficient balanced");
    }
    catch(const char*e){
        cout<<"Insufficient";
    }
    
}



