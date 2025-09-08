#include <iostream>
using namespace std;

int main() {
    int day;
    cout << "Enter the day you want to see the timetable.\nGive the number of the day (1 for Monday, 7 for Sunday): ";
    cin >> day;

    switch (day) {
        case 1:
            cout << "The day is Monday.\nOn this day, you have to open GFG and do Course 1.";
            break;
        case 2:
            cout << "The day is Tuesday.\nOn this day, you have to open GFG and do Course 2.";
            break;
        case 3:
            cout << "The day is Wednesday.\nOn this day, you have to open GFG and do Course 3.";
            break;
        case 4:
            cout << "The day is Thursday.\nOn this day, you have to open GFG and do Course 4.";
            break;
        case 5:
            cout << "The day is Friday.\nOn this day, you have to open GFG and do Course 5.";
            break;
        case 6:
            cout << "The day is Saturday.\nOn this day, you have to open GFG and do Course 6.";
            break;
        case 7:
            cout << "The day is Sunday.\nThis is your rest day!";
            break;
        default:
            cout << "Please enter a valid day (1 to 7).";
            break;
    }

    return 0;
}
