# include <iostream>
// call by value 
using namespace std;
void fn(int no){
    no = no+9;
    cout << "no that i gave is: " << no<< endl;
}
int main(){
    int no = 99;
    fn(no);
    cout << "the no that i gave in main: " << no << endl;

    return 0;
}