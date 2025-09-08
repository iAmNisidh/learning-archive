class nobile
{
    static   String brand ;
    int price;
    int storage;
    static 
    {
        brand= "hjklfads";
        System.out.println("in static block");


    }

    public nobile() // this is a constructor
    {
        brand="";
        price =1;
        storage= 16;
        System.out.println("in constructor");
    }


    public void show ()
    {
        System.out.println(brand +":" +price+":"+storage);

    }
}
public class Static_block_39 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Class.forName("nobile"); //this line will not create obj it will just instatiate the class load a class 
        // nobile obj1= new nobile();
        // obj1.brand="smarphone";
        // obj1.price=554656;

        // nobile obj2= new nobile();

        // obj1.show();
        
        
    }
    
}
//