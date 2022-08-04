package ReplitHw6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Replit195 {

        /*
        Question 195
        Create the HashSet with list of Integers add the below numbers for the list

111

111

111

999

999

999

Print elements one by one.

Expected Output

999
111
         */
        public static void main(String[] args) {
                HashSet <Integer> hashSet=new HashSet<>();

        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(999);
        hashSet.add(999);
        hashSet.add(999);

                Iterator iterator= hashSet.iterator();
                while (iterator.hasNext()){
                        System.out.println(iterator.next());
                }



    }
}
