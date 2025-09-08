#include <iomanip>   // for std::scientific and std::setprecision
#include <iostream>
using namespace std;

int main() {
    double x = 1.23, y = 1122456.453;

    cout << std::scientific;

    cout << x << "\n";  // 1.230000e+00
    cout << y << "\n";  // 1.122456e+06

    cout << std::setprecision(2);
    cout << x << "\n";  // 1.23e+00
    cout << y << "\n";  // 1.12e+06

    double z = 1.2e+7;
    cout << z;          // 1.20e+07

    return 0;
}
