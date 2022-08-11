package DayilyAndReplitPractice;

import java.util.*;

public class Fruit {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0);
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.20);
        fruit.put("Banana",10.2);
        fruit.put("Apple",10.5);
        Set<String> keys=fruit.keySet();
        for (String key : keys) {
            System.out.println("key = "+key);
        }
        Collection<Double> values=fruit.values();
        for (Double value : values) {
            System.out.println("value = "+value);
        }
        //ArrayList<Double> values=new ArrayList<Double>(fruit.values());
        //System.out.println(values);
    }
}
