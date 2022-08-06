package ReplitHw6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit206 {
    /*
    Create a Hash Map of String pairs

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using entry set print key and values pairs using loop

Remove below from Map

"ONE"

"FOUR"

Using entry set print key and values pairs using loop

Expected Output:

HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
     */
    public static void main(String[] args) {
        Map<String, String> map206 = new HashMap<>();
        map206.put("ONE", "AAA");
        map206.put("TWO", "BBB");
        map206.put("THREE", "CCC");
        map206.put("FOUR", "DDD");
        map206.put("FIVE", "EEE");
        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> entry : map206.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);


        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");

        map206.remove("ONE");
        map206.remove("FOUR");
        Iterator<Map.Entry<String,String>> iterator=map206.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
