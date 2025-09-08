# include <iostream>
using namespace std;
creatingFn(int array[], int size){
    int total = 00;
    for(int i = 0 ; i < size; i++){
        total +=array [i]; 
    }
    return total;
}

int main(){
   int givingValueofArray[7] ={1,2,3,4,5,6,7,};
   int total = creatingFn(givingValueofArray,7);
    


    return 0;
}