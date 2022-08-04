package ReplitHw6;

import java.util.HashSet;
import java.util.Set;

public class Replit196 {

    /*
    Question 196
    Create a Set and and below values to it.

    [third, first, second]

    Print HashSet and then remove all the elements from Hashset and print it again.

    Expected Output:

    [third, first, second]
    []
     */
    public static void main(String[] args) {

        Set<String> hashSet= new HashSet<String>();
        hashSet.add("third");
        hashSet.add("first");
        hashSet.add("second");

        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);

    }
}
