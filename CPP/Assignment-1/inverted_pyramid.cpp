#include <iostream>
using namespace std;

int main() {
    int n = 5;  // number of rows
    
    for(int i = 0; i < n; i++) {
        // print spaces
        for(int sp = 0; sp < i; sp++) {
            cout << " ";
        }
        
        // print stars
        for(int st = 0; st < 2 * (n - i) - 1; st++) {
            cout << "*";
        }
        
        cout << endl;
    }
    return 0;
}
