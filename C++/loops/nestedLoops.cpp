//multiple table 
# include <iostream>
using namespace std ;
int main (){
    cout << "tell till which no you want all the table from 1 \n" ;
    int x ,y;
    cin >> x >> y ;
    for (int i = 1 ; i<= x ; i++){
        cout << "table of "<< i << endl ;
        for (int j = 1 ; j<= y ; j++)
        cout << i<<"x"<<j<<"="<< i*j << "    \n" ;
    }
    
            

        
    
}