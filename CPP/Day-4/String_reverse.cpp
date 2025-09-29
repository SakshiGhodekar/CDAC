#include <iostream>
#include <string>
#include <algorithm> // Required for std::swap

void reverseString(std::string& str) {
    int n = str.length();
    // Initialize two pointers: 'start' at the beginning and 'end' at the end
    int start = 0;
    int end = n - 1;

    // Loop until the pointers meet or cross
    while (start < end) {
        // Swap the characters at the 'start' and 'end' positions
        std::swap(str[start], str[end]);
        // Move 'start' pointer forward and 'end' pointer backward
        start++;
        end--;
    }
}

int main() {
    std::string myString = "Hello, C++!";
    std::cout << "Original string: " << myString << std::endl;

    reverseString(myString);

    std::cout << "Reversed string: " << myString << std::endl;

    return 0;
}