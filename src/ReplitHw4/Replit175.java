package ReplitHw4;

import jdk.swing.interop.SwingInterOpUtils;

public class Replit175 {
    /*
    **Follow Steps Carefully.

    Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)

    Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)

    Step 3: Inherit both interfaces to Main class.

    Step 4: Execute both methods

    Expected Output:

    First Method implementing multiple Inheritance
    Second Method implementing multiple Inheritance
     */

}

interface FirstInterface{
    void firstMethod1175();
}

interface SecondInterface{
    void secondMethod2175();
}



class Main1175 implements FirstInterface{

    @Override
    public void firstMethod1175() {
        System.out.println("First Method implementing multiple Inheritance");

    }
}

class Main2175 implements SecondInterface{

    @Override
    public void secondMethod2175() {
        System.out.println("Second Method implementing multiple Inheritance");
    }
}

class MainOriginal174{
    public static void main(String[] args) {
        Main1175 obj175= new Main1175();
        obj175.firstMethod1175();
        Main2175 obj2175=new Main2175();
        obj2175.secondMethod2175();
    }
}
