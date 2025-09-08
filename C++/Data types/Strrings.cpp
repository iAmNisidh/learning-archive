#include <iostream>
using namespace std;

int main() {
    string name = "Nisidh Kumar";

    cout << name << " \a"; // Beep (may or may not work depending on terminal)
    cout << " - Alert (Beep Sound)\n";

    cout << name << "X\bY"; // Backspace erases X
    cout << " - Backspace (Erases Last Character)\n";

    cout << name << "\f"; // Form feed (might not show effect)
    cout << " - Form Feed (Page Break - usually ignored)\n";

    cout << name << "\nNext Line"; // New line
    cout << " - New Line\n";

    cout << "123456\rABC"; // Carriage return
    cout << " - Carriage Return (Overwrites from Start)\n";

    cout << name << "\tTabbed"; // Tab
    cout << " - Horizontal Tab Space\n";

    cout << name << "\vVertical"; // Vertical tab
    cout << " - Vertical Tab Space\n";

    cout << "Single quote: \' " << "- Single Quote\n";
    cout << "Double quote: \" " << "- Double Quote\n";
    cout << "Backslash: \\ " << "- Backslash\n";
    cout << "Question mark: \? " << "- Question Mark\n";

    cout << "Hexadecimal \\x41 = \x41" << " - Hexadecimal for 'A'\n";

    return 0;
}
