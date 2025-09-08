interface A {
    void show(int x);
}

public class lambda_expressions_73 {
    public static void main(String[] args) {
        A obj = x -> System.out.println("Nisidh you are this much great->"+x);
        obj.show(1000000);
        
    }
    
}
// new A()
// {
//     public void show()
// }
// these whole line is replaced by lambda expression->