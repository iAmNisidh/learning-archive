# include <iostream>
using namespace std ;
int largestInArray(int arr[],int size ){
    for (int i = 0 ; i<size ; i ++){
        bool flag = true;
        for(int j = 0 ; j<size; j ++){
            if (arr[j]>arr[i]){
                flag = false ;
                break ; 
            }
        }
        if (flag == true )
        return i ;
    }
    return -1 ;
}

int main(){
    int arr[5] ={8,5,7,2,9},size = 5 ;
    int largestNo = largestInArray(arr,size);
    for (int i = 0; i == largestNo; i++) {
        cout << arr[i] << "\n ";
    }
    cout << largestNo;
    return 0 ; 
}




















# include <iostream>
using namespace std ;
void noFrom1toN(int n){
    if (n<=0){
        return;
    }
   
    noFrom1toN(n-1);
     cout << n << endl  ;
     
}
int main(){
    cout << "enter the no from which you want the back counting ";
    int n ;
    cin >> n;
    noFrom1toN(n);
}