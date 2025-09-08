#include <iostream>
using namespace std;

// Insert variable into array
int insert(int arr[], int size, int inputVar, int capacity, int position)
{
    if (size == capacity)
        return size;

    int indexx = position - 1;
    for (int i = size - 1; i >= indexx; i--) {
        arr[i + 1] = arr[i];
    }
    arr[indexx] = inputVar;
    return size + 1;
}

int main() {
    int  position;
    cin  >> position;

    int arr[100] = {}; // Use fixed size for safety
    int x = 56;

    arr[0] = 99;
    arr[1] = 95;
    arr[2] = 96;
    arr[3] = 91;

    int currentSize = 4;

    int newSize = insert(arr, currentSize, x, 100, position);

    //cout << newSize << endl;

    for (int i = 0; i < newSize; i++) {
        cout << arr[i] << " ";
    }

    return 0;
}
