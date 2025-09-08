# include <iostream>
using namespace std;
int main(){
    // lambda 
    auto variable = [](int parametera){
        cout << "showing the  value of the parameter given in the code: " << parametera << endl ;    
    };
    variable(7);

    return 0;
}
