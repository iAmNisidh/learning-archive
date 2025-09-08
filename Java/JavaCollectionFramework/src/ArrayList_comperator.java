import java.util.ArrayList;
import java.util.Comparator;

final class MyComperator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {         // if int is negetive o1 should come before else +ve comes o2 should come before 
        
        return o2-o1;
    }
    
} 




public class ArrayList_comperator {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList();
        list.add(7);
        list.add(2);
        list.add(6);
         
        list.sort(new MyComperator());

    }
    
}
