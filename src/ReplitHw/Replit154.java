package ReplitHw;

public class Replit154 {
    /*
    Question (154)
    In Parent Class.

    Create a no-argument constructor and include the logic to print "Parent Constructor without argument"

    Create another constructor that takes one parameter of integer type called number.

    include the logic to print the value of the number.

    In Child class.

    Create a Constructor without parameter and include the logic to print "Child Constructor without argument"

    Overload the constructor by adding one parameter of type integer

    Inside the constructor call the parameterized parent class constructor.

    In Main Class.

    Create an object of Child without passing any argument.

    And then another object of Child class by passing the value "10". run the application.

    Expected Output:

    Parent Constructor without argument
    Child Constructor without argument
    10
     */
    Replit154(){
        System.out.println("Parent Constructor without argument");
    }
    int number=10;
    Replit154(int number){
        this.number=number;
    }
    void printInfo(){
        System.out.println(number);
    }
        }

class Child154 extends Replit154{
    Child154() {
        System.out.println("Child Constructor without argument");

    }

    void printInfo(){
        System.out.println(super.number);
    }
}

class Tester154{
    public static void main(String[] args) {
        Child154 obj=new Child154();
        obj.printInfo();
    }
}
