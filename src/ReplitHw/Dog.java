package ReplitHw;

import com.sun.tools.javac.Main;

public class Dog {
    /*
    Question (145)
    Complete the Dog.java class:
    Create following class variables.

    dogName

    dogWeight

    static dogBreed=Mutt;

    For all methods and variables use proper naming convention.

    Create constructor to initialize instance variables

    In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.
    Expected Output:

    Tarzan Mutt 50.0
    Lucy Mutt 10.0
     */
    String dogName;
    static String dogBreed;
    double dogWeight;

    Dog(String dogName, String dogBreed,double dogWeight){
        this.dogName=dogName;
        this.dogBreed=dogBreed;
        this.dogWeight=dogWeight;

    }

    void dogInfo(){
        System.out.println(dogName+" "+ dogBreed+" "+dogWeight);
    }

    public static void main(String[] args) {
        Dog obj1=new Dog("Tarzan","Mutt",50.0);
        obj1.dogInfo();
        Dog obj2=new Dog("Lucy","Mutt",10.0);
        obj2.dogInfo();
    }
}
