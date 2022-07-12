package ReplitHw2;

public class Replit164 {

    /*
    Create a method hello() in parent class that will print "method in Parent class" then override that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

    In Main Class create 3 object of the child classes and store in into an array and call method hello():

    Expected Output:

    method in Child1 class
    method in Child2 class
    method in Child3 class
     */

    public static void main(String[] args) {
    Child1164 obj1164=new Child1164();
    obj1164.printInfo();
    Child2164 obj2164=new Child2164();
    obj2164.printInfo();
    Child3164 obj3164=new Child3164();
    obj3164.printInfo();
    }
}

class Parent164{
    void printInfo(){
        System.out.println("method in Parent class");
    }
}

class Child1164 extends Parent164{
    void printInfo(){
        System.out.println("method in Child1 class");
    }
}

class Child2164 extends Child1164{
    void printInfo(){
        System.out.println("method in Child2 class");
    }
}

class Child3164 extends Parent164{
    void printInfo(){
        System.out.println("method in Child3 class");
    }
}

