package ReplitHw6;

import java.util.*;

public class Replit198 {
    /*
    Create Set to store String Objects and you want them to be stored in ascending order

Please add the below values and see the result

"India"

"Australia"

"South Africa"

"India"

"America"

"America"

Print the Set.

Expected Output:

[America, Australia, India, South Africa]
     */

    public static void main(String[] args) {
        Set<String> hashset= new HashSet<String>();
        hashset.add("India");
        hashset.add("Australia");
        hashset.add("South Africa");
        hashset.add("India");
        hashset.add("America");
        hashset.add("America");

        List<String > list=new ArrayList<String>(hashset);
        Collections.sort(list);
        System.out.println(list);

    }
}
