# include <iostream>
# include <vector>
# include <deque>
# include <list>
# include <set>
# include <map>
# include <string>
# include <ctime>
# include <unordered_set>
# include <unordered_map>
# include <multimap>

using namespace std ;


struct Product{
   int productId;
   string name ;
   string category; 
};
struct Order{
    int orderId;
    int productId;
    int quantity;
    string customerId;
    time_t orderDate;
};
int main(){
    vector<Product> Products= {
        {101,"dell","dayToDay"},
        {102,"hp","datToDay"},
        {103,"lenovo","Professional"},
        {104,"apple","Professionl"},
        {105,"msi","Gaming"},
        {106,"asus","Gaming"},
        {107,"aser","General"},
        {108,"rog","Gameing"}
    };

    deque<string> recentCustomer ={"C1001","C1256","C2354"};
    recentCustomer.push_back("C6526");
    recentCustomer.push_front("C9282");


    list<Order> orderHistory;
    orderHistory.push_back({1,101,1,"C1001",time(0)});
    orderHistory.push_back({2,104,1,"C1256",time(0)});
    orderHistory.push_back({1,103,3,"C6526",time(0)});


    set<string>categories;
    for(const auto &Product:Products){
        categories.insert(Product.category);
    }
    

    map<int,int> productStock= {
        {101,15},
        {102,11},
        {103,10},
        {104,7},
        {105,3},
        {106,16},
        {107,12},
        {108,8}

    };


    multimap<string,Order> customOrders;
    for (const auto &Order:orderHistory){
        custoemrOrders.ins
    }

    return 0;
}

