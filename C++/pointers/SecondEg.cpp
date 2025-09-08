# include <iostream>
using namespace std ;
int main(){
    int x = 20 ;
    int *ptr = &x ;
    cout << *ptr <<"\n";
    x= x+30 ;
    cout << *ptr<< "\n";
    *ptr = *ptr +40 ;
    cout << x <<"\n";
    return 0 ;

}