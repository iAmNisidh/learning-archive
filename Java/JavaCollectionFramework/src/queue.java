
import java.util.LinkedList;
import java.util.Queue;



public class queue {
    public static void main(String[] args) {
        Queue <Integer> list = new  LinkedList<>();
        list.add(1);
        list.add(9);
        System.out.println(list.size());

        System.out.println(list.remove()); //throws exceotion if emoty
        System.out.println(list.poll());

        System.out.println(list.element());//throws exceotion if emoty
        System.out.println(list.peek());

         

        
    }
}
