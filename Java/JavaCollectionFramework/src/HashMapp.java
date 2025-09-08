import java.util.HashMap;
import java.util.Set;

public class HashMapp {
    public static void main(String[] args) {
         HashMap <Integer,String> map = new HashMap<>();
        map.put(1,"nisidh");
        map.put(2,"tannu");
        map.put(3,"prem");
        map.put(4,"ram");
        map.put(null, "harish");
        map.put(5,null);
        map.put(6,null);
        
        System.out.println(map);
        String nameOf2rdStudent = map.get(2);
        System.out.println(nameOf2rdStudent);
        System.out.println(map.get(1));
        System.out.println(map.containsKey("raju"));
        System.out.println(map.containsValue("ram"));

        // Set <Integer> keys = map.keySet();
        // for(int i:keys){
        //     System.out.println(map.get(i));
        // }


        
    }
}
