package opps;

 class Humans
{
    private String name;//="nisidh";
    private  int age;//=19; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}

public class geters_setter_41
{
    public static void main(String[] args) 
    {
        Humans o1=new Humans();
        o1.setAge(20);
        o1.setName("Nisidh");
        System.out.println(o1.getAge() +":"+ o1.getName());

        
    }

    
}
// we can use alt+insert to add the getter and setter.