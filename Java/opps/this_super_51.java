package opps;
class A extends Object                                // every class in java extends object class
{
    public A()
    {
        super();
        System.out.println("inside a");   
    }
    public A(int ab,int d)
    {
        super();
        System.out.println("inside a intli");
    }
}    
class C extends A
{
    public C()
    {
        super();     //(8,6);
        System.out.println("inside c");
    }
    public C(int a,int b)
    {
        //super ();     //(a,b);
        this();
        System.out.println("inside c inti");

    }
}

public class this_super_51 {
    public static void main(String[] args) {
       //C obj = new C();
       //A obj1 = new A(1);
        C obj2 = new C(8,6);
        //A obj3 = new A();
       
        
    }
    
}
// every constructor has a method(super) 
// this will execute constructor of same class 