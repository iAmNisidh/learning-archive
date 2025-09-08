#include <bits/stdc++.h>
using namespace std;
void fun(int *arr, int size){
int temp  = arr[0];
arr[size] = temp;
    for(int i = 0 ; i <size; i++){
        arr[i]= arr[i+1];
        
    }

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int arr[] = {5, 8, 6, 9, 2};
    int size = sizeof(arr) / sizeof(arr[0]);

    fun(arr, size);
    

    for (int i = 0; i < size; i++) {
        cout << "[" << arr[i] << "] ";
    }

return true;   
    

}