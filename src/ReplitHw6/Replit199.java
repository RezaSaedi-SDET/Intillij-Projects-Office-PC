package ReplitHw6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Replit199 {

        /*
        Create a Set collection in which you want to preserve an order of inserted String Objects.

Add the below values

null

Sohil

Diego

Alijon

Asel

Sumair

Print values 1 by 1 using loop and Iterator

null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
         */
        public static void main(String[] args) {

            Set<String> linkedHashSet=new LinkedHashSet<String>();
            linkedHashSet.add("null");
            linkedHashSet.add("Sohil");
            linkedHashSet.add("Diego");
            linkedHashSet.add("Alijon");
            linkedHashSet.add("Asel");
            linkedHashSet.add("Sumair");

            System.out.println(linkedHashSet);
            Iterator<String> iterator= linkedHashSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

            Iterator<String> iterator1= linkedHashSet.iterator();
            while (iterator1.hasNext()){
                System.out.println(iterator1.next());
            }



        }
}
