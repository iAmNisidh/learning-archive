#include <iostream>
using namespace std;

class Test {
public:
    Test() {
        cout << "inside default constructor\n";
    }

    Test(int x) {
        cout << "inside parameterized constructor\n";
    }
};

class Main {
    Test obj;

public:
    Main() :obj(7)        // this will only call the parameterized constructor now 
    {
        //obj = Test(7);  // this is calling both default and parameterized even the parameterized is called 
    }
};

int main() {
    Main m;
    
    return 0;
}


// iut out out of the programm is
//  inside default constructor
// inside parameterized constructor
// even if we are not callling the default constructor 