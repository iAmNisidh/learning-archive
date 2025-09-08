# include <iostream> 
using namespace std ;

class Integers{
    private:
    int x,y;
    string xInWords ;
    public: 
    Integers() : x (5), y(10),xInWords("five")    // initialising value via Initilizer list 
    {
       
    } 
    Integers(int x1 , int y1 ,string s1){
        x= x1 ;
        y = y1 ;
        xInWords = s1 ;
        
    }
    void print (){
        cout << "the value of int x :"<<x <<" and in words are: "<< xInWords << " and the value of y: "<< y<< endl ;

    }

};
int main(){
    Integers obj,obj2(10,13,"tenn") ;
    obj.print() ;
    obj2.print() ;
    Integers *ptr = new Integers(9,150,"nine");
    ptr ->print();
    
    return 0 ;
}
// we access class members using .opp if we use pointer to acccces clss member we use -> opp .
// clas membes are initilize with default value and then constructir body is executed 