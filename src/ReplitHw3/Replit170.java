package ReplitHw3;

public class Replit170 {

    /*
    Overload 2 final instance methods:

    Call them in main method

    Expected Output:

    Final method with boolean parameter
    Final method with String parameter
     */

    public static void main(String[] args) {
        Replit170 obj1=new Replit170();
        obj1.boo();
        obj1.S();

    }

    final void boo(){
        System.out.println("Final method with boolean parameter");
    }

    final void S(){
        System.out.println("Final method with String parameter");
    }
}
