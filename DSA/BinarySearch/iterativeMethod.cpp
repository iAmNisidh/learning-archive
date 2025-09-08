# include <iostream>
using namespace std;
int binarySearch(int arr[],int x ,int size){
    int low ,high ,mid ;
    while(high>=low){
        low = 0;
        high = size-1;
        mid =low+ (high-low/2);
        if (mid == x){
        return mid;
        }
         if (arr[mid]>x){
            high=mid-1;
        }
        else low=mid+1;
    }
}
int main(){
    int arr[] = {4,8,9,6,0},x,size ;
    cout << "Enter the no you want to serch in an array"<< endl;
    cin >> x ;
    size = sizeof(arr)/sizeof(arr[0]);
    int index = binarySearch(arr, x , size);
    cout << "Index at which the given elemt is "<< index << endl ;
}

