package afteropppss54.enumm;



enum status{
    running,failed,pending,success;
}
public class enum_if_else_69 {
    public static void main(String[] args) {
        status s= status.pending;
    if (s == status.running){
        System.out.println("all good");
   
    }
     else if (s== status.failed){
        System.out.println("try again");
    }
    else if (s== status.pending){
        System.out.println("angru bangru tangru");
    }
        
    }
    
    
    
    
}


// we can compare the values in enum  