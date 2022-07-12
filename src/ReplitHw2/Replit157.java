package ReplitHw2;

public class Replit157 {
    /*
    Question (157)
    Create a Parent class

    create instance method m1 saying "m1 method in parent class"

    Create a Child class that will be a derived class from Parent

    Create same instance method m1 saying "m1 method in child class"

    Create another method m2 in child class and inside that method call method m1 from child class and method m1 from parents class

    in Main class.

    Create and object of child class and call m2 method

    Expected Output:

    m1 method in child class
    m1 method in parent class
     */
    public static void main(String[] args) {
        Child157 obj=new Child157();
        obj.printInfo2();
    }
}

class Parent157{
    String printInfo1( String m1){
        return m1;
    }
}

class Child157 extends Parent157{
    String printInfo1( String m1){
       return m1;
    }

    void printInfo2(){
        System.out.println(printInfo1("m1 method in child class"));
        System.out.println(super.printInfo1("m1 method in parent class"));
    }
}
