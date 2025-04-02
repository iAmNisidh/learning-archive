import classAAfolder.AA;
import classAAfolder.cc;

class D extends cc
{
     public void nisi()
     {
        System.out.println(marks1);
     }
}

public class access_modifiers_54 {
    public static void main(String[] args) {
        AA obj = new AA();
        int r3= obj.marks;
        System.err.println(r3);
        bb obj1 = new bb();
        System.out.println(obj1.marks);
        obj.show();
        cc obj3 = new cc();
        System.out.println(obj3.d);
    }
    
}
// if it shows the error felid AA.marks is not visible  this means marks is not public 
// whan it is not public we can not acces outside the packadge 
// there is no need of public inn bb as it is in same folder as of this 
// for method we dont need to write public 
// by default there is an access modifier named privet protected  . default simply means it could accesed in same package 
// whwn we are using protected we can not use marks1  it works in the same package but it doent wprk in other package
//we can not acess marks1 outside the package but we can use marks1 outside the package but it shoul be subclass of the main class 
//means by extending the class to other class 
// there cant be two public class in same file 
// keep instance variable privet 


































//Access modifiers in Java are keywords that determine the visibility and accessibility of classes, methods, and variables. They control which parts of a program can access certain members of a class, ensuring data encapsulation and security.