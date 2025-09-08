# include <iostream>
using namespace std;

 
int* prepareChaiOrders(int cups){
    int* orders =  new int[cups];
    for(int i = 0 ; i<cups; i++){
        orders[i] = i*10;
    }
    return orders;
}

int main(){
    
    int*chaiOrder = prepareChaiOrders(9);
    for(int i = 0 ; i<5;i++){
        cout << "cups: " << i+1 << " has " << chaiOrder[i] << " ml" << endl ;
    }
    delete[] chaiOrder;
   
    return 0;
}