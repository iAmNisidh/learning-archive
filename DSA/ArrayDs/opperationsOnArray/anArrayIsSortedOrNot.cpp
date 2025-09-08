#include <bits/stdc++.h>
using namespace std;
bool fun (int arr[],int size){
    for(int i = 0 ; i <size ; i++){
        if(arr[i]<arr[i+1]){
            return true;
        }
    }
    return false ;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int arr[5] ={1,2,3,4,5},size = 5 ;
    bool v = fun(arr,size);
    cout << v;
    
    return 0;
}

