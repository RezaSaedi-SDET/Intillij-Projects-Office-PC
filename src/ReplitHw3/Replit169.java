package ReplitHw3;

import java.util.Arrays;

public class Replit169 {
    /*
    Question 169
    Create final method avgElements that will average all the elements in an integer array (passed to the method as a parameter) and return the average.

    Expected Output:

    4.8
     */
    int[] a = {2,7,3,8,4};
    public static void main(String[] args) {
        double avg = Arrays.stream(new int[]{2,7,3,8,4}).average().getAsDouble();

        System.out.println("avg: " + avg);

    }
}
