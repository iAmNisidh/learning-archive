

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapdempo {
    public static void main(final String[] args) {
        SortedMap <String,Integer> sortedmap = new TreeMap<>();
        sortedmap.put("Person1",97);
        sortedmap.put("Person2",91);
        sortedmap.put("Person3",99);
        sortedmap.put("Person4",90);
        sortedmap.put("Person5",95);
        sortedmap.put("Person6",94);

        System.out.println(sortedmap);
        System.out.println(sortedmap.firstKey());
        System.out.println(sortedmap.lastKey());
        System.out.println(sortedmap.headMap("Person5")); // exclude 
        System.out.println(sortedmap.tailMap("Person3")); //include 
        NavigableMap<Integer, String> navigableMap = new TreeMap<>() ;
        navigableMap.put(1, "One");
        navigableMap. put (5 , "Five") ;
        navigableMap. put (3, "Three") ;
        System. out. println(navigableMap) ; 
        System. out. println(navigableMap. lowerKey(4) ) ;
        System. out. println(navigableMap. ceilingKey (3) ) ;
        
    }
   
}
