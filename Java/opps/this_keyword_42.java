package opps;

 class Humans
{
    private String name;//="nisidh";
    private  int age;//=19; 

    public String getName()
    {
        return name;
    }

    public void setName(String n) 
    
    {
        this.name = n;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}    
    

public class this_keyword_42
{
    public static void main(String[] args) 
    {
        Humans o1=new Humans();
        o1.setAge(20);
        o1.setName("Nisidh");
        System.out.println(o1.getAge() +":"+ o1.getName());

        
    }

    
}
//set age(method) has its own stack
//how to diffrentiate betweeen instance variable and local variable
//we can do it by passing taht obj itself
// this is the keyword that repreents the current obj 
// current obj means the obj which is calling the method 