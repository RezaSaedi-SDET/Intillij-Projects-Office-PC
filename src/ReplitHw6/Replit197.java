package ReplitHw6;

import java.util.HashSet;
import java.util.Set;

public class Replit197 {

    /*
    Question 197
    Create a set collection in which you do not want to preserve or sort the order and add below values to it.

Red

Pink

Yellow

White

Black

Print set collection

And get total number of colors available in the set

Expected Output:

Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
     */


    public static void main(String[] args) {

        Set<String> hashSet=new HashSet<String>();
        hashSet.add("Red");
        hashSet.add("Pink");
        hashSet.add("Yellow");
        hashSet.add("White");
        hashSet.add("Black");

        System.out.println("Original Hash Set: "+hashSet);
        System.out.println("Size of the Hash Set: "+hashSet.size());


    }
}
