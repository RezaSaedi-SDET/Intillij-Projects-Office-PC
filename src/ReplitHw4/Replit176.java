package ReplitHw4;

public class Replit176 {
    /*
    Step 1: Create Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.

    Step 2: Create an Interface as ChildInterface that will be a child interface of Parent Interface and will have a method childMethod without parameters.

    Step 3: Inherit the Main class to Child Interface.

    Step 4: Execute both methods

    Expected Output:

    Parent Method-welcome to Syntax
    Child Method-hello Syntax
     */
}

interface ParentInterface176{
    void method1176();
}

interface ChildInterface176 extends ParentInterface176{
    void childMethod176();
}

class Main176 implements ChildInterface176{

    public static void main(String[] args) {
        Main176 obj176=new Main176();
        obj176.method1176();
        obj176.childMethod176();
    }
    @Override
    public void method1176() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod176() {
        System.out.println("Child Method-hello Syntax");
    }
}
