 package opps;

 class Humans
{
    private String name;//="nisidh";
    private  int age;//=19; 
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)  
    {
        age=a;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    } 

}

public class encapsulation_40 
{
    public static void main(String[] args) 
    {
        Humans o1=new Humans();
        o1.setAge(20);
        o1.setName("Nisidh");
        System.out.println(o1.getAge() +":"+ o1.getName());

        
    }

    
}
// to acces the private instance variable we need add method.
// assign the values inn same clas only
// Then we create public method 
//then we return the value of age and name into the meathod  
// after creating public meathod we call it using obj.methodname using getName
// by getName we are getting the age and the name.
//if we dont have to give the name there we can set data using setName there default value is0
// when we are etting the value we are not getting something in return so we can use void