package opps;
class movie
{
    private  String hero;
    private int payment;

    public movie(){            // this is a default constructor 
        hero="Nisdh";
        payment=0;

    }

    public movie(int p , String h){   // this is  a parameterized constructor 
        hero = h;
        payment = p;


    }
    //getter for hero
    public  String getHero()
    {
        return hero;

    }
    // getter for payment
    public int getPayment()
    {
        return payment;

    }
    //setter for hero
    public void setHero( String hero)
    {
        this.hero=hero;
    }
    //setter for payment
    public void setPayment(int payment)
    {
        this.payment=payment;
    }
    public movie(String hero, int payment) {
        this.hero = hero;
        this.payment = payment;
    }
  

}


public class default_paramererized_44 {
    public static void main(String[] args) {
        movie obj = new movie("sahrukh", 8975);
        movie obj1= new movie();
        System.out.println("The name of the hero is: "+obj.getHero());
        System.out.println("and his payment is: "+obj.getPayment());
        System.out.println("The name of the hero is: "+obj1.getHero());
        System.out.println("and his payment is: "+obj1.getPayment());
        
    }
    
}
// when we dont use constructor it is automaticaly created .
