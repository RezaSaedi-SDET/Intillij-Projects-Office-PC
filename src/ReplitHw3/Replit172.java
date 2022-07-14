package ReplitHw3;

public class Replit172 {
    /*
    Question 172
    Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

    Make Main class to be a derived class from Parent.

    In main method execute both methods

    Expected Output:

    Child class providing implementation
    Parent class providing implementation
     */

    public static void main(String[] args) {
    Child172 obj172=new Child172();
    obj172.m2172();
    obj172.m1172();
    }
}

abstract class Parent172{
    abstract void m2172();
    public void m1172(){
    }
}

class Child172 extends Parent172{

    public void m2172(){
        System.out.println("Child class providing implementation");
    }
    public void m1172(){
        System.out.println("Parent class providing implementation");

    }
}
