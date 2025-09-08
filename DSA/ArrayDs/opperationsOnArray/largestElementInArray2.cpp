
# include <iostream>
using namespace std ;
int largestelement(int *arr, int size ){
    if (size == 0 ){
        return -1;
    }
    int largestno ;
    for (int i = 1 ; i < size ;i++){
        if (arr[i]>arr[largestno]){
            largestno = i ;
        }
        
        
    }
    return largestno;
}
int main (){
    int arr[4]  = {4858,9,7388888,779};
    int size = sizeof(arr) / sizeof(arr[0]);  
    cout<<largestelement (arr , size);
    return 0 ;
}















