#include <iostream>
#include <string>
using namespace std;

int main() {
    string userName;
    int userRoll;
    bool isConfirmed;

    cout << "What's your name?\n";
    getline(cin, userName);

    cout << "Do you confirm the username? (1 for true / 0 for false): ";
    cin >> isConfirmed; // user enters 1 or 0

    cout << "What's your roll number?\n";
    cin >> userRoll;

    cout << "\nUsername Confirmation: " << boolalpha << isConfirmed << endl;
    cout << "Your name: " << userName << "\nYour roll number: " << userRoll << endl;

    return 0;
}
