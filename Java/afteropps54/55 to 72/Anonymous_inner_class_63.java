package afteropppss54;

class Helloo{
    public void  A() {
        System.out.println("iuhasduihfaisuhf");

        
    }
}

public class Anonymous_inner_class {
    public static void main(String[] args) {
        Helloo obj = new Helloo()
        {
            public void A() {
                System.out.println("inside a ");
                
            }
         
            

        };
        obj.A();
        
    }
    
}
