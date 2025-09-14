#include <iostream>
using namespace std;

int main() {
    int n = 5;   // number of rows
    
    for (int i = 0; i < n; i++) {
        char ch = 'A' + i;   // current alphabet
        for (int j = 0; j <= i; j++) {
            cout << ch << "  ";  // print with spaces
        }
        cout << endl;
    }
    return 0;
}
