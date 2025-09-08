package afteropppss54.enumm;



enum hello{
            hi,how_are_you,hemloo,hglo;
        }

public class enum_68 {
    public static void main(String[] args) {
       
        hello h = hello.hi;
        System.out.println(h);
        System.out.println(h.ordinal());
        hello[] hh = hello.values();
        System.out.println(hh[2]);

        for (hello n: hh) {
            System.out.println(n+":"+n.ordinal());
            
        }
    }
    
}
