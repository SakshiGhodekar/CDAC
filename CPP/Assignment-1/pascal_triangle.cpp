#include <iostream>
using namespace std;

int main() {
    int n = 6;  // number of rows
    
    for (int i = 0; i < n; i++) {
        // print leading spaces
        for (int sp = 0; sp < n - i - 1; sp++) {
            cout << "   ";   // 3 spaces for alignment
        }
        
        int val = 1;
        for (int j = 0; j <= i; j++) {
            cout << val << "     ";  // print number with gap
            val = val * (i - j) / (j + 1); // next value
        }
        cout << endl;
    }
    
    return 0;
}
