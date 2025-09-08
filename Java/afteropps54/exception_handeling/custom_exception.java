package exception_handeling;
class nisidhexception extends Exception{
    public nisidhexception(String string){
        super(string);
    }
}

public class custom_exception {
    public static void main(String[] args) {
        int i = 0;
        int j= 0 ;
        int n[]=new int [8];
        n[1]= 9;
        String str= null;
        try{                                    
            j= 0-i;
            if (j==0)
            throw new nisidhexception("this is the exceptio created by nisidh");

        }
        catch(nisidhexception e){
            System.out.println("cannot devide by 0 "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limits"+e);
        }
        
        catch(Exception e ){
            System.out.println("there is an error in the code "+" "+e);
        

        }
        System.out.println(j);
        System.out.println("the code ends here ");
    }
    
}
