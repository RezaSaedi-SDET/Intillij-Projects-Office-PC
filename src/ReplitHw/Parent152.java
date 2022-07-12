package ReplitHw;

public class Parent152 {
    /*

    Question (152)
    In Parent class.

    Create a constructor, it will take a String parameter called city.

    include the logic of printing the parameter value.

    Create another constructor without parameter.

    Include the logic of printing "Parent Constructor".

    Create a Child Class that should be a subclass of Parent class

    Inside child class create a constructor that will make a call to parameterized constructor of the parent class.

    In Main class.

    Create an Object of the child class by passing String value "Vienna"

    Expected Output:

    Vienna
     */
    String city152;
    Parent152(String city152){
        this.city152 = city152;
    }
    void printInfo(){
        System.out.println(city152);
    }

    Parent152(){
    }
    void printInfo1(){
        System.out.println("Parent Constructor");
    }

}

class Child152 extends Parent152{
    Child152(String city){
        this.city152 =city;
    }
}

class Tester{
    public static void main(String[] args) {
        Child152 obj=new Child152("Vienna");
        obj.printInfo();
    }
}





