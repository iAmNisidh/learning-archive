package afteropppss54;
interface  computer{
     void code();
    
}


class laptop implements  computer{
    public void code()
    {
        System.out.println("code compile run");
    }
}

class desktop implements  computer{
    public void code()
    {
        System.out.println("code compile run : faster");
    }
}





class Dev{
    public void devApp(computer lap)     // here we are passing laptop obj
    {
        System.out.println("devloping app");
        lap.code();
    }
   
}


public class need_interface_66 {
    public static void main(String[] args) {
        //computer comp = new computer();
        computer lap = new laptop();

        computer desk = new desktop();

        Dev nisidh = new Dev();
        nisidh.devApp(desk);
    }
    
}
 