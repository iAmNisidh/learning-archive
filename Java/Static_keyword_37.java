

class phone
{
    static  String brand;
    int price;
    int storage;

    public void show()
    {
        System.out.println(brand+":"+price+" "+storage);
    }
}
public class Static_keyword_37 
{public static void main(String[] args) 
    {
        phone obj1= new phone();
        phone.brand="Samsung";
        obj1.price=51000;
        obj1.storage=512;

        phone obj2= new phone();
        phone.brand="Apple";
        obj2.price=79000;
        obj2.storage=512;
        
        phone. brand="oneplus";
        obj1.show();
        obj2.show();

    
    }
    
}
//Static variable should be called with the name of class 
// stattic variable are shared by diff obj.
//static keyword means you are making something as a class member not a obj member