package afteropppss54;

class laptop {
    String laptopname;
    int laptopprice;
    public String  toString()
    {
        //return " Helo nisidh";
        return laptopname + "::"+laptopprice;
    }
    // public boolean  equal(laptop that)
    // {
    //     // if(this.laptopname.equals(that.laptopname) && this.laptopprice == that.laptopprice)
    //     // return true ;
    //     // else 
    //     // return false; 
        
    // }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((laptopname == null) ? 0 : laptopname.hashCode());
        result = prime * result + laptopprice;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (laptopname == null) {
            if (other.laptopname != null)
                return false;
        } else if (!laptopname.equals(other.laptopname))
            return false;
        if (laptopprice != other.laptopprice)
            return false;
        return true;
    }
    
}

public class obj_class_58 {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.laptopname = "Lenovo";
        obj.laptopprice = 75000;
        //System.out.println("the modle name is "+laptopname+"and the price is "+laptopprice);
        System.out.println(obj.toString());
        //System.out.println(obj.ToString());
        System.out.println(obj);


        laptop obj1 = new laptop();
        obj1.laptopname = "Lenovo";
        obj1.laptopprice = 75000;


        //boolean result =obj1 == obj;
        boolean result = obj.equals(obj1);
        System.out.println(result);

    }
    
}
// every time we try to print the obj it will automatically addd to string method to it 