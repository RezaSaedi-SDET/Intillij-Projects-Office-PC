package ReplitHw2;


public class Replit162 {

    /*
    Overload static method and then execute both overloaded methods.

    Expected Output:

    static method without parameter
    static method with int parameter
     */

    public static void main(String[] args) {
        Replit162 obj162=new Replit162();
        obj162.word162();
        obj162.word162(7);
    }
    void word162(){
        System.out.println("static method without parameter");
    }

    void word162 (int num){
        System.out.println("static method with int parameter");
    }
}
