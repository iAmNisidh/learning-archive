import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylistt {
    public static void main(final String[] args) {
    // list creation
    //  type 1
        ArrayList<Integer>list = new ArrayList<>(15);
        list.add(1);
        list.add(8);
        list.add(4);
        list.add(null);
        list.remove(0);               // ye index pe se remove karta hai 
        list.add(0,5);
        list.set(1,6);
        Collections.sort(list);
        list.remove(Integer.valueOf(1));  // ye obj remove karane ke liye hai or bas first occurance ko  
        Object[] arrayy = list.toArray();
        list.toArray(new Integer[8]);
        System.out.println(list);


        System.out.println(list.size());
        System.out.println(list.get(3));
        for (int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        // for(int x: list){
        //     System.out.println(x);
        // }
        //System.out.println(list.contains(4));

    // type 2
        List <String> list0 = new ArrayList<>();
        System.out.println(list0.getClass().getName());


    // type 3 
        List <String>list1=Arrays.asList("Monday","Tuesday");   // in this type of list we can set another value but cant add the value 
        System.out.println(list1.getClass().getName());


    // type 4 
        String[] array = {"a","b","c"};
        List <String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

    //  type 5 
        List <Integer> list3 = List.of(1,2,3,4);      // but in this type of list we cant even add or replace any value 
        System.out.println(list3.getClass().getName());

//........................................................................

        List <Integer> listu =List.of(4,5,6,3,7,9);
        list.addAll(listu);
        System.out.println(list);
        



        }
}
