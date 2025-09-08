# include <iostream>
# include <vector>
using namespace std ;

class Chai {
    public:
        // data members (attributes)
        string teaName;  // name of the tree 
        int servings;    // bo of servings 
        vector <string> inggredients; // list of ingiredients of the tea 
        // member function
        void displaiChaiDetails(){
            cout << "Tea name: " << teaName << endl ;
            cout << "cups served:" << servings << endl ;
            cout << "ingreadients: \n";
            for(string ingredient : inggredients){
                cout << ingredient << endl;  
        }
            cout <<"---"<< endl;


        }
};

int main(){
    Chai chaiobj;
    chaiobj.teaName = "lemontea";
    chaiobj.servings = 2;
    chaiobj.inggredients={"water","lemon","tea","sugar"};
    chaiobj.displaiChaiDetails(); 
    return 0 ;
}