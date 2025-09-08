# include <iostream>
using namespace std ;
int  sumOfNo(int n){
    if (n<9){
        return n ;
    }
    else 
  {  
    return (sumOfNo(n/10)+n%10) ;}


    
}

int main(){
    cout <<sumOfNo(101);
}