# include <iostream>
using namespace std ;
int main(){
    int x = 10 ;
    int *p ;          // the purpus of the star here is to declare the p variable that it is a pointer variable not like dereference opp 
    p =  &x ;
    cout << x <<endl<<
     *p<< endl  <<  // in this line * is used as dereference opp 
      p  ;
}