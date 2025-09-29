 #include <iostream>
using namespace std;
class Test {
public:
     Test() { cout << "\n Constructor executed"; }
 
    ~Test() { cout << "\n Destructor executed"; }
};
 main()
{
    // Create multiple objects of the Test class
    Test t, t1, t2, t3;
}