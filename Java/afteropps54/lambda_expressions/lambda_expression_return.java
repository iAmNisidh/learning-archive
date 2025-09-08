
@FunctionalInterface
interface A{
    int add(int i , int j);
    

}
public class lambda_expression_return {
    public static void main(String[] args) {
        A obj = (i,j) ->   i+j;
        int result = obj.add(7,9);
        System.out.println(result );
        
    }
}
// lambda expression works with only functioal interface 
// we dont even need return as it is alredy there what ever we mention infornt of -> it is always of return type 