import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Vectore {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,2);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());

        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(2);

        Vector<Integer> vec = new Vector<>(list);
        System.out.println(vec);



        
    }
    
}
