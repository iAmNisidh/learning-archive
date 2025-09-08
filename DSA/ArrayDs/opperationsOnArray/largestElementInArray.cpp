# include <iostream> ;
using namespace std;
void largestElement(int arr[],int size ){
    int tempv,tempi;
    for(int i = 0 ; i <size ; i ++){
        if (arr[i]<arr[i+1]){
            tempv = arr[i];
            tempi = i ;
           
        }
      arr[tempi] <arr[tempi+1];
        
    }
}
int main(){
    int arr []= {555,66,8,};
    int size = sizeof(arr)/sizeof(arr[0]);
    largestElement(arr, size);
    
}
