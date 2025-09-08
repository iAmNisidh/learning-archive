import java.util.Stack;

public class Stackk {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("mango");
        stack.push("banana");
        stack.push("orange");
        System.out.println(stack);
        System.out.println(stack.pop());
        String peep = stack.peek();
        System.out.println(peep);
        stack.isEmpty();
        int serch = stack.search("apple");
        System.out.println(serch);

        
    }
}
