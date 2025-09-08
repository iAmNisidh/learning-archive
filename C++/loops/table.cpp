# include <iostream>
using namespace std ;
int main (){
    cout << "enter the no for which you want the table: \n";
    int a ;
    int b ;
    cin >> a >> b;
    cout << "so you want the table of "<< a << "\n";
    for(int i=1 ; i<=b ;i++ ){
        cout <<a<<"x"<<i<<"="<< a *i <<"\n" ;  
    }
}