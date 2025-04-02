package afteropppss54;




interface A{
    void show();
    void config();
    int age=81;
    String area="delhi";

}
interface X{
    void run();  

}

interface Y extends X{

}
class B implements A,Y{
    public void show()
    {
        System.out.println("inside show ");
    }
    public void config()
    {
        System.out.println("inside config");
    }
    public void run() {
        System.out.println("running");
    }
    
}

public class interface_65_67 {
    public static void main(String[] args) {
       A obj = new B();
       obj.show();
       obj.config();
       X obj1 = new B();
       obj1.run();
       
       System.out.println(A.area);
    }
    
}


// if in a abstract class there is olny abstract method then insted of abstract class we can use interface 
//interface is not a class 
//by deffault every method in the interface is public abstract
//if we fail to implement the methods of interface it will became a abstract class 
// we can not create a obj of a but we can create obj of b
// all the variablees inside interface are final and static
// as the variable is final so first we need to instalise the value 
// in impliments we only get methods not teh variable
// in interface we can have 1 class is implemaenting multiple interfaces  this can not have with abstract class in abstract class we can extend only one class 
// inheritance is valid in interfacces 
//class to class -> extends 
// class to interface  -> implements 
// interface to interface -> extends 