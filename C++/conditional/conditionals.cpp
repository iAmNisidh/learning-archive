# include <iostream>
# include <string>
using namespace std;
int main(){
    int cupsOrdered;
    double priceOf1Pc = 50.00;
    double totalprice , discountedPrice ;
    cout << "total no of cups you want?";
   cin >> cupsOrdered;
    totalprice = cupsOrdered*priceOf1Pc;
    
    if (totalprice>=150)
    {
        discountedPrice =500- (5*5004)/100;
        cout << "as your order is above 150 you get an extra 5 percent discount. ypur new price is:" << discountedPrice;
        
    }
    

}