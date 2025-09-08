# include <iostream>
using namespace std ;
void function (string *s){
    cout << *s+" and roll no is 1912." << endl;
}
int main(){
    string s = "my name is nisidh";
    function (&s);
    cout << s <<endl;
    
}