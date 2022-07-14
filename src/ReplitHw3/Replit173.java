package ReplitHw3;

public class Replit173 {
    /*
    Create a Super Class Tea that will have:

    instance variable teaType;
    constructor that will initialize
    unimplemented method addSugar(),
    Create 2 subclasses of Tea as Lemon Tea and Chai Tea.

    In main class create an object of 2 Child and assign them to Parent reference type.

    Execute method addSugar from both classes.

    Expected Output:

    For Lemon Tea we need 2 spoons of sugar
    For Chai Tea we need 1 spoon of sugar
     */

    public static void main(String[] args) {
        LemonTea obj1173=new LemonTea("Lemon Tea");
        obj1173.addSugar("2 spoons of sugar");
        ChiTea obj2173=new ChiTea("Chai Tea");
        obj2173.addSugar("1 spoon of sugar");


    }

}

abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }

    void addSugar(String sugar){
        System.out.println("For "+teaType+" we need "+sugar);
    }
}

class LemonTea extends Tea{

    LemonTea(String teaType) {
        super(teaType);
    }
}

class ChiTea extends Tea{
    ChiTea(String teaType){
        super(teaType);
    }

}