# include <iostream>
using namespace std;
int main(){
    int anArray[5] = {1,2,3,4,5};
    cout << anArray[9999] ;        // 0x5ffeb0 prints address of first element 


    return 0;
}