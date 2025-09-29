#include <iostream>
#include <fstream>
using namespace std;
int main() {

   
    ofstream my_file("tt.txt");
 
    if(!my_file) {
        cout << "Error: Unable to open the file." << endl;
    }

  
    my_file << "Line 1" << endl;
    my_file << "Line 2" << endl;
    my_file << "Line 3" << endl;
   
    my_file.close();

    return 0;
}