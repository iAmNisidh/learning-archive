#include <iostream>
using namespace std;

void reverseOfAnArray(int *arr, int size) {
    for (int i = 0; i < size / 2; i++) {
        int temp = arr[size-1-i];
        arr[size-i-1] = arr[i] ;
        arr[i] =temp;
       
    }
}

int main() {
    int arr[] = {5, 8, 6, 9, 2};
    int size = sizeof(arr) / sizeof(arr[0]);

    reverseOfAnArray(arr, size);

    for (int i = 0; i < size; i++) {
        cout << "[" << arr[i] << "] ";
    }

    return 0;
}
