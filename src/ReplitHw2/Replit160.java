package ReplitHw2;

public class Replit160 {
    /*
    Question (160)
    Overload instance method display by having different types of parameters

    Inside each method write the logic to print value of the parameter

    Call all methods inside your main method

    Expected Output:

    100
    Syntax Technologies
    100.09
     */

    public static void main(String[] args) {
        Replit160 obj160=new Replit160();
        obj160.printInfo(100);
        obj160.printInfo("Syntax Technologies");
        obj160.printInfo(100.09);

    }

    void printInfo(int num){
        System.out.println(num);
    }

    void printInfo(String txt){
        System.out.println(txt);
    }

    void printInfo(double num){
        System.out.println(num);
    }

}
