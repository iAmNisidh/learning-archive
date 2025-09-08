# include <iostream> 
using namespace std ;
int main(){
    int arr[] = {1,5,8,6,3,7},x = 8;
    for (int x : arr){
        if (x==8){
            return arr[x];

        }
    }
    return -1 ;
}