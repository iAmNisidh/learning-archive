

class calculator 
{
    //int a;
     public int add(int n1,int n2)
    {

         System.out.println("in add");
         //int r = n1 + n2;

         return 7;

    }

}

public class class_obj 
{
    public static void main(String[] args) 
    {
         int num1= 7;
         int num2= 14;
         calculator calc=new calculator() ;// calc is called as referance variable name from whhich we can acces the meathod.
        int result =calc.add(num1,num2);



         //int result = num1 + num2;

        System.out.println(result);



        
    }


    
}
