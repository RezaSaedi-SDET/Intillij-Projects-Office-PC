package ReplitHw;

public class Skm153 {
    /*
    Question (153)
    In parent class

    Create a non argument constructor and write a logic to print "This is Parent constructor"

    Create a Child Class that will be subclass of the Parent class.

    Create a constructor without parameter and call parent class constructor expicitly

    In Main Class.

    Create and object of Child class and run the application.

    Expected Output:

    This is Parent constructor
     */
    Skm153(){
        System.out.println();
    }
    void printInfo153(){
        System.out.println("This is Parent constructor");
    }

}

class Child153 extends Skm153{

    Child153(){

    }
}

class Tester153{
    public static void main(String[] args) {
        Child153 obj153=new Child153();
        obj153.printInfo153();
    }
}
