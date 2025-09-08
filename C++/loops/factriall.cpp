# include <iostream>
using namespace std ;
int main (){
    cout << " give the no. you want the factorial of : \n";
    int x ;
    cin >> x ;
    int res = 1;
    for (int i = 2; i <= x; i++)
        res *= i;

    cout<< res ;    
    return 0;
    
}