#include <iostream>
using namespace std;

namespace nisidh {
    void display() {
        cout << "inside nisidh namespace" << endl;
    }
}

int main() { 
    cout << "this is my first cpp code" << endl;
    cout << "this is my first cpp code222" << endl;
    nisidh::display();

    system("pause"); // <- Add this
    return 0;
}
 