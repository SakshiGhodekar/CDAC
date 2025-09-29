#include <iostream>
#include <fstream>
using namespace std;
int main() {

    
    fstream my_file("tt.txt", ios::app);
  
    if(!my_file) {
        cout << "Failed to open the file for appending." << endl;
        return 1;  
    }

    my_file << "Line 4" << endl;
    my_file << "Line 5" << endl;

    my_file << "Line 6" << endl;

  
    my_file.close();

    return 0;
}