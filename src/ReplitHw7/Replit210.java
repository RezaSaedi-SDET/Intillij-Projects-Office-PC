package ReplitHw7;

public class Replit210 {
    /*
    Complete the code, handle possible exception

Expected Output:

/ by zero
     */
    public static void main(String[] args) {
        //int a=10, b=0 result;

        //result = a/b;

        int a=10, b=0,result;
        try {
            result=a/b;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
        }


    }
}
