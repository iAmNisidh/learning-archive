#include <iostream>
#include <vector>
using namespace std;



void insertionSort(vector<float> &arr , int n){
    for(int i = 1; i<n ; i++){
        int curr = arr[i] , prev = i-1;
        while(prev>= 0 && arr[prev] > curr){
            arr[prev+1] = arr[prev];
            prev --;
        }
        arr[prev+1] = curr;
    }
}

int main(){
    vector<float> arr;
    int n;
    cout << "Enter the number of property to take input :" ; cin >> n;
    for (int i=0; i<n ; i++){
        int input;
        cout<<"enter the value of the propert :" ; cin >> input;
        arr.push_back(input);
    }


    insertionSort(arr,n);

    for(int i=0 ; i<n ; i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}