#include <iostream>
#include <iomanip> // Required for std::fixed and std::setprecision
using namespace std;

int main() {
    double x = 1.23, y = 1122456.453;

    cout << std::fixed;
    cout << x << "\n"; // 1.230000
    cout << y << "\n"; // 1122456.453000

    cout << std::setprecision(2);
    cout << x << "\n"; // 1.23
    cout << y << "\n"; // 1122456.45

    double z = 1.2e+7;
    cout << z;         // 12000000.00

    return 0;
}
