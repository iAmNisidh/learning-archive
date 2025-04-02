//import mypackage.Coc;


public class inheretance_48_49_50 extends advCalc {

    public static void main(String[] args) {
        veryAdvCalc c= new veryAdvCalc();
        int r1 = c.add(8,65);
        int r2 = c.sub(4444, 895);
        System.out.println(r1+"  "+r2);
        int r3= c.div(4,2);
        System.out.println(r3);
        double r4= c.power(4,8);
        System.out.println(r4);

    }
    
}
// in 49 we addd veryAdvCalc
// in 50 we know multilevel inheritance doent work in java  because if we have a fn y in both the parentt class whome whil it inherit from so there is no multiple inheritanc in java 