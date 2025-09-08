# include <iostream>
using namespace std;
int main(){
    int anArray[5] = {1,2,3,4,5};
    for (int &x : anArray)
    x= x*2 ;
   for (int x : anArray)
   cout << x << endl ;

    return 0;
}