#include<iostream>
#include<stdexcept>
using namespace std;
  int main()
  {
    try{
        int choice;
        cout<<"Enter 1 for int exeception,2 for string exeception: ";
        cin>>choice;

        if(choice==1)
        throw 404;

        else if(choice==2)
         throw string("something went wrong");

         else
         throw runtime_error("invalid error");
    }

    catch(  int x)
    {
        cout<<"caught int exception :"<<x<<endl;
    }
    catch(string &s)
    {
        cout<<"caught int exception :"<<s<<endl;
    }
    catch(exception &e)
    {
        cout<<"caught_runtimeerror:"<<e.what()<<endl;
    }
  }
