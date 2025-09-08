#include <iostream>
#include <vector>
using namespace std;



void bubbleSort(int arr[] , int n){
    int countSwaps = 0;
    for(int i = 0; i<n-1 ; i++){
        for(int j = 0; j<n-i-1 ; j++){
            if(arr[j] > arr[j+1]){
                swap(arr[j],arr[j+1]);
                countSwaps++;
            }
        }
    }

    for (int i = 0 ; i<n;i++){
        cout<<arr[i] << " ";
    }
    cout << "Number of swaps required : " << countSwaps << endl;
}

int main(){
    int n;
    cout << "enter the size of the arr :" ; cin >> n;
    int arr[n];
    for (int i = 0 ; i < n ; i++){
        int input;
        cout << "enter the " << i << " element :" ; cin >> input; arr[i] = input;
    }

    bubbleSort(arr,n);

    return 0;
}