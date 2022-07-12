package ReplitHw2;

public class Replit161 {
    /*
    Question 161
    Overload private instance method m1

    Call each method from the main method.

    Expected Output:

    private m1 method
    private m1 method with int parameter
     */

    public static void main(String[] args) {
        Replit161 obj161=new Replit161();
        obj161.m1();
        obj161.m1(5);

    }

    private void m1(){
        System.out.println("private m1 method");
    }

    private void m1(int num){
        System.out.println("private m1 method with int parameter");
    }
}
