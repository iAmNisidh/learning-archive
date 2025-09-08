// deletition of an element  array 

# include <iostream>
using namespace std;
int deleteionOfArray(int arr[],int size , int valTobeRemoved){
    for (int i = 0 ; i<=size; i++){
        if (arr[i] == valTobeRemoved)
        break ;
        if(i==size)
    return size ;
    for (int j = i ; i < size-1 ; j++){
        arr[j] = arr[j+1];
        return size-1;
    }
    }
    
    
    }

int main(){
    int arr[5] ={1,5,8,6,3} ;
    int size = 5;
    int valToBeRemoved = 8;
    int newSize = deleteionOfArray(arr, size , valToBeRemoved);
    cout<<"Size of new  array:" <<newSize<< endl ;
    cout << "new array: [";
     for (int i = 0; i < newSize; i++) {
        cout << arr[i] << " ";
    }
    cout << "]";
    return 0;

}
