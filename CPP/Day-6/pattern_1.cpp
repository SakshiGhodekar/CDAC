#include<iostream>
using namespace std;
int main(){
    int a;
    cout<<"Enter element ";
    cin>>a;

    for(int i=1;i<=a;i++){
        for(int j=1;j<i;j++)
        cout<<j;
        cout<<endl;
    }
        return 0;

}























// #include <iostream>

// int main() {
//     int rows;
//     std::cout << "Enter number of rows for the pyramid: ";
//     std::cin >> rows; // Get the number of rows from the user once

//     for (int i = 1; i <= rows; ++i) { // Outer loop for rows
//         for (int j = 1; j <= i; ++j) { // Inner loop for elements in each row
//             std::cout << j << " "; // Print the number
//         }
//         std::cout << std::endl; // Move to the next line after each row
//     }
//     return 0;
// }