#include <iostream>

int main() {
    int n;
    std::cout << "Enter the number of terms: ";
    std::cin >> n;

    int first = 0;
    int second = 1;

    std::cout << "Fibonacci Series: ";

    if (n >= 1) {
        std::cout << first;
    }
    if (n >= 2) {
        std::cout << " " << second;
    }

    for (int i = 2; i < n; ++i) {
        int next = first + second;
        std::cout << " " << next;
        first = second;
        second = next;
    }
    std::cout << std::endl;
    return 0;
}

