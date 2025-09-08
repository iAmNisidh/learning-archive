#include <iostream>
# include <vector>
# include <string>
using namespace std;
class Chai {
    public:
        string teaName ;
        int servings ;
        vector<string> ingredients ;
    // parameterized constructor 
        Chai(string namm,int nums,vector<string>samagri){
           cout << "constructor called." <<endl ;
           teaName = namm;
           servings = nums;
           ingredients = samagri ;
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
    Chai chaiobj("modi ji wali chai",5,{"milk","tea","juth","chini"});
    
     chaiobj.displaiChaiDetails(); 
    return 0 ;
}