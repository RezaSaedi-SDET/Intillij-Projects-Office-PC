package ReplitHw2;

import jdk.swing.interop.SwingInterOpUtils;

public class Replit155 {
    /*
    Question (155)
    Create three classes (A, B, C)
    Write two constructors:

    Have a default constructor that prints out the following
    For A: "I"

    For B: "am"

    For C: "a tester"

    Make C extend B

    and B extend A

    From your Main class create an object of the C class.

    Expected Output:

    I
    am
    a tester
     */
    public static void main(String[] args) {
        C155 obj=new C155();
        obj.printInfo();
    }
}

class A155{

}
class B155 extends A155{
    String word="I";

}

class C155 extends B155{
    String word="am";
    void printInfo(){
        String word="a tester";
        System.out.println(super.word);
        System.out.println(this.word);
        System.out.println(word);

    }

}