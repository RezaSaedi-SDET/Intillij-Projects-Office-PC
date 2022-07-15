package ReplitHw4;

public class Replit174 {
    /*
    Create an Interface with name as MyInterface

    Create two undefined methods method1 and method2

    Inherit the MyInterface to Main Class.

    Execute both methods

    Expected Output:

    implementation of method1
    implementation of method2
     */


}

interface MyInterface{
    void method1174();
    void method2174();

}

class Main implements MyInterface{
    public static void main(String[] args) {
        Main obj174=new Main();
        obj174.method1174();
        obj174.method2174();
    }
    @Override
    public void method1174() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2174() {
        System.out.println("implementation of method2");
    }
}


