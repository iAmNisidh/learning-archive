# include <iostream>
using namespace std ;

// void fun (int &x ){
//     x = x+5 ;
//     cout << x << endl;

// }   this is done by reference 

void fun (int *p ){
    *p = *p+5 ;
    cout << *p << endl;

} 



int main(){
    int x = 7 ;
    fun(&x);
    cout << x ;
   
}