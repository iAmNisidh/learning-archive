package exception_handeling;

public class throw_keyword_80 
 {
    public static void main(String[] args) {
        int i = 0;
        int j ;
         
        try{
            j = 14/i; 
            if (j==0)
            throw new ArithmeticException("i dont want to print 0");              // put critical statements in try block 
        }
        catch(Exception e ){
            j= 14/2;
            //System.out.println("there is an error in the code "+" "+e);
            System.out.println("thats the default val ");
        

        }
        System.out.println(j);
        System.out.println("the code ends here ");
    }
    
}
