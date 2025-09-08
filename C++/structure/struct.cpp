# include <iostream>
using namespace std;
struct Point {
    int x ; 
    int y ;
};
int main(){
    struct Point p ;   // its not necessary to write struct  to initialize the struct
    p.x = 10 ;
    p.y = 56 ;
    cout << p.x << endl << p.y ;
    return 0 ;
    
}