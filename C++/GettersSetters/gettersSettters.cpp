# include <iostream>
# include <vector>
# include <string>


class Chai {
    private:
       std::string chainame;
        int numOfCups;
    
    public:
        Chai(std :: string name , int cups){
            chainame = name;
            numOfCups = cups;    
        }
        
};


int main(){
    
    Chai obj1("masala chai", 7);
    std::cout << obj1.numsOfCups;



    return 0;
}