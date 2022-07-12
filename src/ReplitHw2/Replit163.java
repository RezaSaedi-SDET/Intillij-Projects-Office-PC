package ReplitHw2;

public class Replit163 {

    /*
    Question (163)
    In Parent Class create a method with name method() that will print "Parent method"

    Override method() in Child class that will print "Child method"

    In Main Class create objects of child and parent class and call its method.

    Expected Output:

    Parent method
    Child method
     */

    public static void main(String[] args) {
        Parent163 obj1163=new Parent163();
        obj1163.printInfo();
        Child163 obj2163=new Child163();
        obj2163.printInfo();
    }
}

class Parent163{
    void printInfo(){
        System.out.println("Parent method");
    }
}

class Child163 extends Parent163{
    void printInfo(){
        System.out.println("Child method");
    }
}

