package opps;


class AA{
    public void show()
    {
        System.out.println("inside AA");
    }
    public void nisidh()
    {
        System.out.println("Inside nisidh");
    }


}
class BB extends AA {
    public void show()
    {
        System.err.println("Inside BB");

    } 

}

//__________________________________********______*******________________________________________________________________________________




class Calcc {
    public int add(int n1 ,int n2 )
    {
        return n1+n2;

    }
}
class advCalcx extends Calcc {
    public int add(int n1, int n2)
    {
        return n1+n2+7;
    }
}
public class method_overriding_52 {
    public static void main(String[] args) {
    //     BB obj = new BB();
    //     AA obj1 = new AA();
    //     obj.show();
    //     obj.nisidh();
    //     obj1.show();
    advCalcx obj = new advCalcx();
    int d1 = obj.add(4,8);
    System.out.println(d1);
     }
    
}
//method overloading and methond overridding 
//in loading we cannot have same fn name 
// in ridding we can have same fn name 