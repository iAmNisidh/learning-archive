#include <iostream>
using namespace std;

class person {
protected:
    string name;
    int roll;
};

class student : public person {
private:
    int marks;

public:
    student(int marks, string name) {
        this->marks = marks;
        this->name = name; // inherited from person
        cout << "The name is " << name << ", the marks are " << marks << endl;
    }
};

int main() {
    student obj(15, "nisidh"); // constructor is called here
    return 0;
}
 