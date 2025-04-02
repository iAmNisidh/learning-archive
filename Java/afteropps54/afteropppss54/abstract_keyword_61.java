package afteropppss54;

abstract class nisidh {
    public  void study(){
        System.out.println("nisidh");
    }

    public abstract void play();       /// here we are declayring the method 
    public abstract void code();
    }
abstract class  tannu extends nisidh{
    public void play(){
        System.out.println("this is tannnu ");

    }
    // public void code()
    // {
    //     System.out.println("coding ");
    // }
} 
class nisidh_tannu extends tannu{        // this is a concrete class 
    public void code()
    {
        System.out.println("inside nisidh tannu coding ");
    }
}
public class abstract_keyword_61 {
    public static void main(String[] args) {
        nisidh obj = new nisidh_tannu();
        obj.study();
        obj.play();
        obj.code();

    }
    
}
// can not create obj of abstract class 
//not necessary to create abstractmethod in abstract class can hsve normal methods 
// it is cumolsary to add the abstract method  in the inhereted class 



















