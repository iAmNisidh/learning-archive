# include <iostream>
using namespace std ;
bool subSetSumAs0(int arr[],int size ){
    for(int i =0 ;i <size; i++ ){
        int sum = 0 ;
        for(int j = i ; j<size ; j++){
            sum += arr[j];
            if (sum == 0 )
            return true ;
        }
    }
    return false;
}
int main (){
    int arr[] = {4,-3,2,1};
    int size = sizeof(arr)/sizeof(arr[0]);
    bool c = subSetSumAs0(arr,size);
    cout << c ;
    return 0;
}