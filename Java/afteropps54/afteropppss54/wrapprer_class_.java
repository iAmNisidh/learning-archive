package afteropppss54;

public class wrapprer_class_ {
    public static void main(String[] args) {
        int num = 7;
        //Integer num1 = new Integer(8);   this concept is known as boxing 
        Integer num1 = 9;
        Integer num2 = num;         // this is called autoboxing
        System.out.println(num1);
        System.out.println(num2);
        int num3  = num2.intValue();      // unboxing 
        System.out.println(num3);
        int num4 = num2;                   // auto unboxing
        System.out.println(num4);       
        String str = "15";
        int num5 = Integer.parseInt(str);
        System.out.println(num5*9); 

    }
}
// wrapper class means for every primitive type we are going to have a class for it 
// for int we have integer class  integer vlass extends the obj class 
//for char we have character 
// double we have double 
