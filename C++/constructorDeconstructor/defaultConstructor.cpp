#include <iostream>
# include <vector>
using namespace std;
class Chai {
    public:
        string teaName ;
        int servings ;
        vector<string> ingredients ;
    // default constructor 
        Chai(){
           cout << "constructor called." <<endl ;
           teaName = " x tea ";
           servings = 1;
           ingredients = {"water","tea","milk"};
        }



        void displaiChaiDetails(){
            cout << "Tea name: " << teaName << endl ;
            cout << "cups served:" << servings << endl ;
            cout << "ingreadients: \n";
            for(string ingredient : ingredients){
                cout << ingredient << endl;  
        }
            cout <<"---"<< endl;
    }



};



int main(){
    Chai chaiobj;
    // chaiobj.teaName = "lemontea";
    // chaiobj.servings = 2;
    // chaiobj.inggredients={"water","lemon","tea","sugar"};
     chaiobj.displaiChaiDetails(); 
    return 0 ;
}