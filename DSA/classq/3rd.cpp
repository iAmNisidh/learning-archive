#include <iostream>
using namespace std;



struct Employee {  
    string name;
    int salary;
}; 

void selectionSort(Employee arr[], int n){
    for (int i = 0; i < n - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j].salary > arr[maxIdx].salary) {
                maxIdx = j;
            }
        }
        if (maxIdx != i) {
            Employee temp = arr[maxIdx];
            for (int k = maxIdx; k > i; k--) {
                arr[k] = arr[k - 1];
            }
            arr[i] = temp;
        }
    }
}

int main(){
    int n;
    cout << "Enter the number of employees: ";cin >> n;
    Employee arr[n];
    for (int i = 0; i < n; i++){
        cout << "Enter the employee name: ";
        cin >> arr[i].name;
        cout << "Enter the employee salary: ";
        cin >> arr[i].salary;
    } 

    selectionSort(arr, n);

    for(int i = 0; i < n; i++){
        cout << "(" <<arr[i].name << " " << arr[i].salary << ")";
    }
    cout << endl;

    return 0;
}