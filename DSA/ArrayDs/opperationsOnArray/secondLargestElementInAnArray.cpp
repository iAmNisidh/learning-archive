#include <bits/stdc++.h>
using namespace std;
int fun (int *arr , int size){
    for (int i = 0 ; i < size ; i++){
        int le ;
        if(arr[i]>arr[le]){
            le = i;
            for (int j = 0 ; j < size ; j++){
                int y = INT16_MIN;
                if(arr[j]<arr[le]){
                    y = j;
                    return y ;
                }
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int arr[]= {1,2,35,64,22},size = 5;
    cout << fun(arr,size);
    
    
    return 0;
}