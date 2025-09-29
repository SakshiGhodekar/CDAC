#include <iostream>
#include <fstream>
using namespace std; 
int main() {

   
    ifstream my_file("example.txt");
    if (!my_file) {

  
    cout << "Error opening the file." << endl;
  
    
}

   
    my_file.close();
    return 0;
}