# include <iostream>
// call by reference 
using namespace std;
void fn(int &no){  // the diference between call by calue and call by reference is just a & singn when we write & sign infront of the variable name when we are passing it in the fn 
    no = no+9;
    cout << "no that i gave is: " << no<< endl;
}
int main(){
    int no = 99;
    fn(no);
    cout << "the no that i gave in main: " << no << endl;

    return 0;
}