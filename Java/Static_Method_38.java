class mobile
{
     static String brand;
    int price;
    int storage;
    public void show()
    {
        System.out.println(brand+":" + price+"-"+storage );
    
    }
    
    public static void show1(mobile obj1)
    {
        //System.out.println("in static method");
        System.out.println(obj1.brand+":" + obj1.price+"-"+obj1.storage );

    }

    
    
    
}
public class Static_Method_38 
{
    public static void main(String[] args)
    {
        mobile obj1=new mobile();
        obj1.brand= "Apple";
        obj1.price=321435;
        obj1.storage=512;

        mobile obj2= new mobile();
        obj2.brand= "Apple";
        obj2.price=64835;
        obj2.storage=128;

        obj1.show();
        obj2.show();

        mobile.show1(obj1);

        
    }
    

    
}





//we cant't call a non static method with the  help of class class 
// we can use ststic variable inside  a static method but you can't use non static variable in static method whyyy???
// price aand storage is a instance variable that meman it will be diff for diff obj
// when we call show with obj1.show it gives price andstorage ogf obj  same as obj2
//when we call mobile.show how do we know which obj we are reffering to (the brand belongs to obj 1 or obj 2)
//thats why it says we can not add non static variable to non static meathod
//we can pass tho obj1 to see the variable in static meathod   when we pass the obj then we have to accept the obj
// basically we have to get the obj reference
//why we have main static if we dont mention static the problem was the main become a non static method. which means we have to create the obj of Static_Method_38. that mens we can not call mainn with the obj of demo
//the q is main is the startin point of the execution if the execution has not started how can you creare a obj of demo 
//to solve the problem we can make this variable as static