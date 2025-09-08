package exception_handeling;

public class exceptioon_handeling_77 {
    public static void main(String[] args) {                                                                                                                                                                                                                                                
        int i = 7;
        int j= 0 ;
        
        try{
            j = i/j;               // put critical statements in try block 
        }
        catch(Exception e ){
            System.out.println("there is an error in the code "+" ");
        

        }
        System.out.println(j);
        System.out.println("the code ends here ");
    }
    
}
// catch block will be executed only in case of exception