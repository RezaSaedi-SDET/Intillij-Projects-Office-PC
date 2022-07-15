package ReplitHw5;

import java.util.ArrayList;

public class Replit187 {
    /*
    Create an array list to type String.

    Add these values below to your arraylist

    hi

    yo

    sup

    yolo

    boop

    Remove 1, 3, 5 element from an array

    print remained values one by one in one line

    Expected Output:

    yo yolo
     */
    public static void main(String[] args) {
        ArrayList arr187=new ArrayList();
        arr187.add("hi");
        arr187.add("yo");
        arr187.add("sup");
        arr187.add("yolo");
        arr187.add("boop");
        System.out.println(arr187);

        arr187.remove(0);
        arr187.remove(1);
        arr187.remove(2);

        for (int i = 0; i < arr187.size(); i++) {

            System.out.print(arr187.get(i) + " ");
        }




    }
}
