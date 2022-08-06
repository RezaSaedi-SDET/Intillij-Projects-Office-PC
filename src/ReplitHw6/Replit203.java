package ReplitHw6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Replit203 {
    /*
    CCreate HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

map.put("mango", 40);

Using iterator retrieve all keys and values if the format below:

Expected Output:

Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
     */
    public static void main(String[] args) {
        Map<String,Integer> map203=new HashMap<>();
        map203.put("mango",10);
        map203.put("apple",30);
        map203.put("orange",20);
        map203.put("mango",40);
        map203.put("mango",40);
        Iterator<Map.Entry<String,Integer>> iterator=map203.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer>entry=iterator.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
    }
}
