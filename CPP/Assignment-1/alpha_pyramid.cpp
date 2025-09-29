#include <iostream>
using namespace std;

int main() {
    int n = 5;  // number of rows
    
    for (int i = 0; i < n; i++) {
        // print spaces for alignment
        for (int sp = 0; sp < n - i - 1; sp++) {
            cout << "  ";  // 2 spaces (for pyramid shape)
        }

        // print alphabets
        char ch = 'A';
        for (int j = 0; j <= 2 * i; j++) {
            cout << ch << " ";
            ch++;
        }
        cout << endl;
    }
    
    return 0;
}
