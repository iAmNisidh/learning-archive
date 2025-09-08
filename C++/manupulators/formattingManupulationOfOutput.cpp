#include <iostream>
#include <iomanip>  // Required for setw, setfill, left
using namespace std;

int main() {
    int a = 12;

    cout << setw(5);
    cout << setfill('*');
    cout << a << "\n";       // ***12

    cout << setw(5);
    cout << "Hi" << "\n";    // ***Hi

    cout << left;
    cout << setw(5);
    cout << a << "\n";       // 12***

    return 0;
}
