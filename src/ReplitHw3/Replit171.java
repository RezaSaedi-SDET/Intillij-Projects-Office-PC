package ReplitHw3;

public class Replit171 {

    /*
    Question 171
    Create a Parent Class that will have two overloaded abstract methods m1

    Make Main class as concrete subclass to Parent Class

    In main method call the methods.

    Expected Output:

    m1 without parameters
    m1 method with parameter
     */

    public static void main(String[] args) {
    Chidl171 obj171=new Chidl171();
    obj171.m1();
    obj171.m2();
    }
}

abstract class Parent171{

    abstract void m1();
    abstract void m2();
}

class Chidl171 extends Parent171{

    void m1(){
        System.out.println("m1 without parameters");
    }
    void m2(){
        System.out.println("m1 method with parameters");
    }
}
