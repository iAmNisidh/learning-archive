# include <iostream>
# include<cstring> 
using namespace std ;
int main(){
    char s1[] = "hello ";
    char s2[] = {'N','S','I','D','H','\0'};
    cout << strlen(s1) << endl;
    cout << strlen(s2) << endl ;
    int  res = strcmp(s1,s2);
    if (res == 0 ){
        cout << "same";
    }
    else if (res<0){
        cout << "smaller";
    }
    else{
        cout << "greatest \n";
    }
    char str[10];
    strcpy (str,"Nisidh");
    cout << str ;


    
    return 0 ;
}