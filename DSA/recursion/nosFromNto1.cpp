# include <iostream>
using namespace std ;
void noFromNto1(int n){
    if (n<=0){
        return;
    }
    cout << n << endl  ;
    noFromNto1(n-1);
     ;
}
int main(){
    cout << "enter the no from which you want the back counting ";
    int n ;
    cin >> n;
    noFromNto1(n);
}