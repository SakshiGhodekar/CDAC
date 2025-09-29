#include<iostream>
#include<string.h>

using namespace std;

class Student {
public:
    int rollno;
    char name[30];
    int marks[5];
    int sum = 0;
    int dd, mm, yy;

    void accept();
    void display();
};

void Student::accept() {
    cout << "Enter rollno: ";
    cin >> rollno;

    cout << "Enter name: ";
    cin >> name;

    cout << "Enter birthday (dd mm yy): ";
    cin >> dd >> mm >> yy;

    cout << "Enter 5 subject marks: ";
    for (int i = 0; i < 5; i++) {
        cin >> marks[i];
    }
    
    // Calculate sum of marks
    sum = 0;
    for (int i = 0; i < 5; i++) {
        sum += marks[i];
    }
}

void Student::display() {
    cout << "\nRoll No: " << rollno << endl;
    cout << "Name: " << name << endl;
    cout << "Date of Birth: " << dd << "/" << mm << "/" << yy << endl;
    cout << "Total Marks: " << sum << endl;
}

int main() {
    int n = 3; // Reduced n for a more manageable example
    Student s1[n];

    cout << "Enter data for " << n << " students:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "\nStudent " << i + 1 << "\n";
        s1[i].accept();
    }
    
    // Sorting students by roll number using Bubble Sort
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (s1[j].rollno > s1[j + 1].rollno) {
                // Swap the entire Student objects
                Student temp = s1[j];
                s1[j] = s1[j + 1];
                s1[j + 1] = temp;
            }
        }
    }

    cout << "\nSorted Student Data by Roll Number:" << endl;
    for (int i = 0; i < n; i++) {
        s1[i].display();
    }

    return 0;
}