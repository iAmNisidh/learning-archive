# include <iostream>
using namespace std ;
int main (){
   cout << "enter the no till which you want to write starting from 0 \n" ;
   int x ;
   int y;
   cin >> x >> y ;
   for (int i = 1 ; i<= x ; i++){
    if (i%y==0){
        continue; 
        
    }
    cout << i << endl ;
   }
}