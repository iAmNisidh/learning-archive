
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedhashmap = new LinkedHashMap<>(11,2,true);
        linkedhashmap.put("nisidh",10);
        linkedhashmap.put("hello",93);
        linkedhashmap.get("nisidh");
        for (Map.Entry<String,Integer> entry : linkedhashmap.entrySet()) {
            System.out.println(entry.getKey()+": "+ entry.getValue());
            
        }

        // we can convert hashmap to llinked hashmap by putting  the obj of tha hashmap to the liked hashmap constructor
        HashMap<String,Integer> map = new HashMap<>();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map); 
        map.put("nisidhh",99);
        map.put("nisidhh2",92);
        map.put("nisidhh3",96);
        map.put("nisidhh4",91);

       int result =  map.getOrDefault("nisidhh",0);
       System.out.println(result);
        map.putIfAbsent("nisish 9",96);
        System.out.println(map);


        
    }
    
}
