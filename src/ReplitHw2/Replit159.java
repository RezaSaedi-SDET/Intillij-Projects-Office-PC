package ReplitHw2;

public class Replit159 {

    /*
    Create 3 overloaded methods to perform subtraction of 2, 3 and 4 numbers

    In main method execute all 3 methods to match the output:

    Expected Output

    40 (should come from subtracting 4 numbers)
    30 (should come from subtracting 3 numbers)
    20 (should come from subtracting 2 numbers)
     */

    static int subtract159(int num1, int num2, int num3, int num4){
        int sum=num1-num2-num3-num4;
        return sum;
    }

    static int subtract159(int num1,int num2,int num3){
        int sum=num1-num2-num3;
        return sum;
    }

    static int subtract159(int num1,int num2){
        int sum=num1-num2;
        return sum;
    }

    public static void main(String[] args) {
        int sub1=subtract159(80,10,25,5);
        System.out.println(sub1+" (should come from subtracting 4 numbers)");
        int sub2=subtract159(80,30,20);
        System.out.println(sub2+" (should come from subtracting 3 numbers)");
        int sub3=subtract159(50,30);
        System.out.println(sub3+" (should come from subtracting 2 numbers)");


    }
}


