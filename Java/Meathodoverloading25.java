class calculator
{
    public int add (int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
public class Meathodoverloading25
    {
        public static void main(String[] args) 
        {
            calculator obbj = new calculator();
            double r1 = obbj.add(7.7,1.7);
            System.out.println(r1);

            // calculator obj =new calculator();
            // int r2 = obj.add1(3,4);
            // System.out.println(r2);
        }

     
    }

}

