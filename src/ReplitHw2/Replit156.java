package ReplitHw2;

public class Replit156 {
    /*
    Question (156)
    Create class A

    declare variable int i=10;

    Create class B extends A

    declare variable int i=20;

    create a method to display value of variable i from both classes

    In Main Class create an object of subclass and call method display

    Expected Output:

    20
    10
     */
    public static void main(String[] args) {
        B156 obj156= new B156();
        obj156.printInfo();
    }
}
class A156{
    int i=10;
}
class B156 extends A156{
    int i=20;
    void printInfo(){
        System.out.println(i);
        System.out.println(super.i);
    }
}

