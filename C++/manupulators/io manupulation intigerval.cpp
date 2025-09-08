#include <iostream>
#include <bitset>
using namespace std;

int main() {
    int a = 26;

    // Octal with showbase
    cout << std::showbase << std::oct;
    cout << a << "\n";            // 032

    // Hexadecimal with showbase
    cout << std::hex;
    cout << a << "\n";            // 0x1a

    // Hexadecimal without showbase
    cout << std::noshowbase;
    cout << a << "\n";            // 1a

    // Decimal with showpos
    cout << std::dec << std::showpos;
    cout << a << "\n";            // +26

    // Uppercase hex with showbase
    cout << std::hex << std::showbase << std::uppercase;
    cout << a << "\n";            // 0X1A

    // Binary output using bitset
    cout << "0b" << bitset<8>(a) << "\n";    // 0b00011010

    return 0;
}
