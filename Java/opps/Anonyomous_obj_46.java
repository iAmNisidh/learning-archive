package opps;
class A
{
    public A()
    {
        System.out.println("obj created");
    }

    public void show() {
        System.out.println("inside show method ");
        
    }
}    


public class Anonyomous_obj_46 {
    public static void main(String[] args) {
        //System.out.println("bkhgkkkkkkkkkkkk");
        //A obj = new A();        // obj is a reference variable 
        //obj.show();
        new A().show();    // anonymas obj
                          // it cant be reused 
    }
    
}
