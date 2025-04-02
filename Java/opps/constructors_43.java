package opps;



class  humanss
{
    private int age;
    public humanss() // this is a costructor; looks like a method  in constructor we give values
    {
        System.out.println("in construtor");
        age=56;
    }
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    } 
}

public class constructors_43 {
    public static void main(String[] args) {
        //System.out.println("The age of the person is : "+obj1.getAge());
    
        humanss obj1= new humanss();
        humanss obj2= new humanss();
        //obj1.setAge();
        System.out.println("The age of the person is : "+obj2.getAge());
    }
}
// inn the constructor we dont write the type. cause it dont return any thing 
//constructor name should be sane aas class name.
// every time we create obj it will call a constructor
//always do the opperation inside a method 