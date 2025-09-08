# include <iostream>
using namespace std;
void servChai(int cups );
void servChai(string TeaType);
void servChaios(string TeaType="masala chai"){
     cout << "serving "<< TeaType <<" Your Favourite";
}
void servChaios(int x){
    cout << "serving "<< x <<" cups each day."<< endl ;
}




int main(){
     servChai(80);
     servChai("leamon chai");
     servChaios();
    return 0;
}
void servChai(int cups ){
    cout << "serving "<<cups <<" cups each day."<< endl ;
}
void servChai(string TeaType){
    cout << "serving "<< TeaType <<" Your Favourite" << endl ;
    
}
