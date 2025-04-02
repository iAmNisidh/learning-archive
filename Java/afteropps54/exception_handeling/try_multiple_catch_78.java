package exception_handeling;

public class try_multiple_catch_78 {
    public static void main(String[] args) {
        int i = 7;
        int j= 7 ;
        int n[]=new int [8];
        n[1]= 9;
        String str= null;
        try{
            j = i/j; 
            System.out.println(n[1]);              // put critical statements in try block 
            System.out.println(n[4]);
            str.charAt(9);

        }
        catch(ArithmeticException e){
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
