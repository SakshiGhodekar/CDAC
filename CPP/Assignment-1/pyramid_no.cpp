#include <iostream>
using namespace std;

int main() {
    int i, j, sp;
    int n = 5;
    
    for(i = 1; i <= n; i++) {
        // print spaces
        for(sp = 1; sp <= n - i; sp++) {
            cout << " ";
        }
        
        // increasing numbers
        for(j = i; j < 2 * i; j++) {
            cout << j;
        }
        
        // decreasing numbers
        for(j = 2 * i - 2; j >= i; j--) {
            cout << j;
        }
        
        cout << endl;
    }
    return 0;
}
