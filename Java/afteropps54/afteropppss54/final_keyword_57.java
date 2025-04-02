package afteropppss54;
// final keyword === for variable method class  
  class Calc
{
    public final void show()          //  if we add final to the method we can not change that same methhot in another class by  overriding it  
    {
        System.out.println("by nisidh");
    }
    public void add(int a1 , int a2)
    {
        System.out.println(a1+a2);
    }

}
class advCalc extends Calc //extends Calc    this is not possible when final keyword is theree with classs 
{
    //public void show()
    {
        System.out.println("by mr xyz ");
    }

}

public class final_keyword_57 {
    public static void main(String[] args) {
    //     final int x= 7;
    //     //x= 9;
    //     System.out.println(x);
    advCalc obj = new advCalc();
    obj.add(7,14);
    obj.show();
     }
    
}















// in final key word whn we put final behind a variable its value becames constant it cant be cahanged 
// whwn we are making class final means we can not inherit the class 