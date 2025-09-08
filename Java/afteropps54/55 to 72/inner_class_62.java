

package afteropppss54;
class A{

    int age;
    public void show()
    {
       System.out.println("inside show method which is inside class a"); 
    }

     class B{
         public void config()
        {
            System.out.println("iside config method of class b qhoch is inside class a");
        }

    }

}

public class inner_class_62 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 =new B();
        obj1.config();
        
    }
    
}
//agar hame iner class ka obj banana hai to outer class ka obj banana hoga 













//class inside a class means inner class 
// if we want to create a obj of b we nwwd obj of a first 
//for non static method when we need to call we need obj 
//fo b we need to create a obj of a to call b 