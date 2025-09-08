# include <iostream>
using namespace std;
int main(){
    int anArray[5] = {1,2,3,4,5};
    cout << sizeof(anArray)<< endl;
    int n = sizeof(anArray)/sizeof(anArray[0]);
    cout << n ;


    return 0;
}