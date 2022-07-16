package ReplitHw5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Replit191 {
    /*
    Create an ArrayList of type boolean called listA and add below values

    (true, false, false)
    Create another array list call listB and ad all values from List A into it

    Using iterator print all values from ListB 1 by 1

    Expected Output:

    true
    false
    false
     */

    public static void main(String[] args) {
        ArrayList<Boolean> listA1191=new ArrayList<Boolean>();
        listA1191.add(true);
        listA1191.add(false);
        listA1191.add(false);

        ArrayList<Boolean> listA2191=new ArrayList<Boolean>();
        listA2191.add(true);
        listA2191.add(false);
        listA2191.add(false);
        Iterator<Boolean> iterator191=listA2191.iterator();
        while (iterator191.hasNext()){
            System.out.println(iterator191.next());
        }
    }
}
