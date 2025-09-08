#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Chai {
    private:
        string teaName;
        int servings;

    public:
        Chai(string name, int serve) : teaName(name), servings(serve) {}

        friend bool compareServings(const Chai &chai1, const Chai &chai2);
        
        void display() const {
            cout << "Tea name: " << teaName << endl;
        }
};

bool compareServings(const Chai &chai1, const Chai &chai2) {
    return chai1.servings > chai2.servings;
}

int main() {
    Chai obj1("Masala Chai", 4);
    Chai obj2("Lemon Tea", 5);

    obj1.display();
    obj2.display();

    if (compareServings(obj1, obj2)) {
        cout << "Masala Chai has more servings." << endl;
    } else {
        cout << "Lemon Tea has more servings." << endl;
    }

    return 0;
}