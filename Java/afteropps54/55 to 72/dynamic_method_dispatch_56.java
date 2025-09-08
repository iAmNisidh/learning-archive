package afteropppss54;
// implimantation of poly morphisdm 

class A 
{
    public void show()
    {
        System.out.println("inside A show method");
    }
}
class B extends A
{
public void show ()
{
    System.out.println("in B show  ");
}
}
class C extends A
{
    public void show ()
{
    System.out.println("inside C show  ");
}

}


public class dynamic_method_dispatch_56 {
    public static void main(String[] args) {
        //B obj = new B();
        //obj.show();
        A obj = new B();
        obj.show();


        // obj = new B();
        // obj.show();

        // obj= new C();
        // obj.show();
        
    }
    
}
// if the class is extending another class we can take the reference from both the classes 
// it is possible to take the reference of super class  and obj of sub class 
//diff obj have diff behavior (run time polymorphysm)
// same show method is behaving diff with diff obj this is called polymorphysm
// to create diff obj for calsses is called dynamic method dispaatch 
// this couldd only done ehn inheretance is there .we can not use  another class which is not extending  
// we can only have child obj for parent variable 
// we can not have referrance of sub class and obj of suoer class 