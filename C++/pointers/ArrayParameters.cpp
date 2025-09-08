# include <iostream>
using namespace std ;
void function (int *arr , int n){
    //int n = sizeof(arr)/sizeof(arr[0]);// never to do this inside a function to get the value of size of an array inside function rather use seperate parameter 
    for (int i = 0 ; i<n ; i++)
    cout << arr[i]<< " ";
}
int main(){
    int arr[] = {9,5,6,7,3,1};
   
    int n = sizeof(arr)/sizeof(arr[0]);
    for (int i = 0 ; i<n ; i++){
        cout << arr[i] << "\n "<< endl ;
        
    } 
    cout <<endl;
    function(arr,n);
    
    return 0;
}