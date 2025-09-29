#include <iostream>
using namespace std;

int main() {
    int a[3][3];
    int b[3][3];
    int i, j;

    // Input elements for matrix a
    cout << "Enter elements for 3x3 matrix a:" << endl;
    for (i = 0; i < 3; ++i) {
        for (j = 0; j < 3; ++j) {
            cin >> a[i][j];
        }
    }

    // Copy matrix a to b
    for (i = 0; i < 3; ++i) {
        for (j = 0; j < 3; ++j) {
            b[i][j] = a[i][j];
        }
    }

    // Print matrix b
    cout << "Matrix b after copying matrix a:" << endl;
    for (i = 0; i < 3; ++i) {
        for (j = 0; j < 3; ++j) {
            cout << b[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
