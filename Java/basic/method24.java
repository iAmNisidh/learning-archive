

class computer                   // to define playMudic id a behavior we have to use (parennthiesid)
{
    public  void playMusic()     // void is used when we do not want any thing in return.                             // a meathod cann give anything  like a intigre value 
    {
        System.out.println("Music Playing");    
    }
    public String getMePen(int cost)
    {
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
    
             
        
        
    }

}
public class method24
{
    public static void main(String[] args)   // mainn defines the start of the execution
    {
        computer obj = new computer();
        obj.playMusic();
        String str =  obj.getMePen(2);
        System.out.println(str);

        
    }
    
}
