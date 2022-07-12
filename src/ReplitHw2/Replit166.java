package ReplitHw2;

public class Replit166 {

    /*
    Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.

    Create a subclass Cat in which override method sleep

    Create 3 Kitten subclasses of a Cat class and override method eat

    for 1 kitten - eats milk

    for 2 kitten - eats snack

    for 3 kitten - eats everything

    In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:

    Expected Output:

    Cat eats
    Cat sleeps a lot
    kitten1 eats milk
    kitten1 sleeps a lot
    kitten2 eats snacks
    kitten2 sleeps a lot
    kitten3 eats everything
    kitten3 sleeps a lot
     */

    public static void main(String[] args) {
        Cat obj166=new Cat("eats","sleeps a lot");
        obj166.printInfo1166();
        obj166.printInfo2166();
        Kitten1 obj1166=new Kitten1("eats milk","sleeps a lot");
        obj1166.printInfo1166();
        obj1166.printInfo2166();
        Kitten2 obj2166=new Kitten2("eats snacks","sleeps a lot");
        obj2166.printInfo1166();
        obj2166.printInfo2166();
        Kitten3 obj3166=new Kitten3("eats everything","sleeps a lot");
        obj3166.printInfo1166();
        obj3166.printInfo2166();


    }
}

class Animal{
    String eat;
    String sleep;

    Animal(String eat, String sleep){
        this.eat=eat;
        this.sleep=sleep;
    }
}

class Cat extends Animal{
    Cat(String eat, String sleep){
        super(eat, sleep);
    }
    void printInfo1166(){
        System.out.println("Cat "+eat);
    }
    void printInfo2166(){
        System.out.println("Cat "+sleep);
    }
}

class Kitten1 extends Cat{
    Kitten1(String eat, String sleep){
        super(eat, sleep);
    }
    void printInfo1166(){
        System.out.println("kitten1 "+eat);
    }
    void printInfo2166(){
        System.out.println("kitten1 "+sleep);
    }
}

class Kitten2 extends Cat{
    Kitten2(String eat, String sleep){
        super(eat, sleep);
    }
    void printInfo1166(){
        System.out.println("kitten2 "+eat);
    }
    void printInfo2166(){
        System.out.println("kitten2 "+sleep);
    }
}

class Kitten3 extends Cat{
    Kitten3(String eat, String sleep){
        super(eat, sleep);
    }
    void printInfo1166(){
        System.out.println("kitten3 "+eat);
    }
    void printInfo2166(){
        System.out.println("kitten3 "+sleep);
    }
}
