package ReplitHw5;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
    /*
    Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

    Numbers in:

    4
    62
    8
    5
    4
    Expected Output:

    4 62 8 5 4
     */

    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int num1=value.nextInt();
        int num2=value.nextInt();
        int num3=value.nextInt();
        int num4=value.nextInt();
        int num5=value.nextInt();
        ArrayList arr188=new ArrayList();
        arr188.add(num1);
        arr188.add(num2);
        arr188.add(num3);
        arr188.add(num4);
        arr188.add(num5);
        for (int i=0;i<arr188.size();i++){
            System.out.print(arr188.get(i)+" ");
        }
    }
}
