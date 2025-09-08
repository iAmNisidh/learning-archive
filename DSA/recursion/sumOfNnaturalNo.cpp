# include <iostream>
using namespace std ;


int sumOfNNo(int n ){
    if (n== 0){
    return n;
    }
    return n+ sumOfNNo(n-1);
}
int main (){
    int n ;
    cout << " enter the no till you want the sum of N natural no."<< endl ;
    cin >> n ;
   cout  << sumOfNNo(n);
}