# include <iostream>
using namespace std ;
class Point{
    int x,y ;
    public :
        Point (int x , int y ){
            this -> x = x ;
            this -> y = y ;

        }
        Point &setX(int x ){
            this -> x = x;
            return *this;
            
        }
        Point &setY(int y ){
            this -> y = y;
            return *this;

        }
};
int main(){
    Point obj (10 ,10);
    obj.setX(7).setY(9);
    return 0 ;
}