package ReplitHw5;

import java.util.LinkedList;

public class Replit190 {
    /*
    Create Linked List that will store first 10 numbers of fibonacci series

    Print number from Linked List 1 by 1 all in 1 line

    Expected Output:

    0 1 1 2 3 5 8 13 21 34
     */
    public static void main(String[] args) {
        LinkedList linky190=new LinkedList();
        linky190.add(0);
        linky190.add(1);
        linky190.add(1);
        linky190.add(2);
        linky190.add(3);
        linky190.add(5);
        linky190.add(8);
        linky190.add(13);
        linky190.add(21);
        linky190.add(34);

        for (int i=0;i<linky190.size();i++){
            System.out.print(linky190.get(i)+" ");
        }
    }
}
