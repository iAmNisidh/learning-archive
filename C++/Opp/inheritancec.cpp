# include<iostream>
using namespace std ;
class Base{
    protected ;
    int x ;
    public :
    Base(int a){
        cout << "inside base case\n";
    
    }
    
};
class Derived:public Base{
        private:
        int y ;
        public:
        Derived(int b,a):y(b),x{
            cout << "inside derived class ";
            void print(){
                cout << x<<"  "<< y << endl;
            }

        }

    };
int main()
{
    Derived d(10);
    d.print();
    return 0;
}