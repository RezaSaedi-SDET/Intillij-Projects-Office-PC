package ReplitHw7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Replit207 {
    /*
    Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT

HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
     */
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("ONE","AAA");
        myMap.put("TWO","BBB");
        myMap.put("THREE","CCC");
        myMap.put("FOUR","DDD");
        myMap.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String,String>> iterator=myMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> it=iterator.next();
            System.out.println(it.getKey()+" : "+it.getValue());
        }
        System.out.println("------------------");
        myMap.replace("THREE","ASEL");
        myMap.replace("FIVE","SUMAIR");
        System.out.println("HashMap After Replace :");
        Iterator<Map.Entry<String,String>> iterator207=myMap.entrySet().iterator();
        while (iterator207.hasNext()){
            Map.Entry<String,String> it2=iterator207.next();
            System.out.println(it2.getKey()+" : "+it2.getValue());
        }
    }
}
