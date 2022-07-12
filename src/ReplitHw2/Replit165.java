package ReplitHw2;

public class Replit165 {

    /*
    Question (165)
    Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".

    Override methods in child class

    In Main Class create object of the child class and see which methods are available

    Expected Output:

    I am a child public method
    I am a child protected method
    I am a child default method
     */
    public static void main(String[] args) {
        Child1165 obj165=new Child1165();
        obj165.printInfo1();
        obj165.printInfo2();
        obj165.printInfo3();
    }
}

class Parent165{
    public void printInfo1(){
        System.out.println();
    }

    protected void printInfo2(){
        System.out.println();
    }

     void printInfo3(){
        System.out.println();
    }

    private void printInfo4(){
        System.out.println();
    }

}

class Child1165 extends Parent165 {
    public void printInfo1() {
        System.out.println("I am a child public method");
    }
    protected void printInfo2(){
        System.out.println("I am a child protected method");
    }

    void printInfo3(){
        System.out.println("I am a child default method");
    }

    private void printInfo4(){
        System.out.println("I am a child private method");
    }
}



