package ReplitHw6;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;

public class Replit202 {
    /*
    Create Map in which we want to store keys in Ascending order

Add the below values

1 item = apple

2 item = banana

3 item = pear

4 item = tomato

5 item = mango

6 item: kiwi

Extract all keys and it values and print them in the format below:

Expected Output:

Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
     */
    public static void main(String[] args) {
        Map<Integer,String> map202=new LinkedHashMap<>();
        map202.put(1,"apple");
        map202.put(2,"banana");
        map202.put(3,"pear");
        map202.put(4,"tomato");
        map202.put(5,"mango");
        map202.put(6,"kiwi");
        for(Map.Entry<Integer,String> entry:map202.entrySet()){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("Key is " + key + " item and values is " + value);

        }


    }
}
