import java.util.Scanner;

public class user_input 
{
    public static void main (String[]  args) 
    {
        System.out.println("taking input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no 1 :");
        int a = sc.nextInt();
        System.out.println("enter no 2 :");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of given two numbers is:");
        System.out.println(sum);
        

        


    }
    
}
