package DayilyAndReplitPractice;

abstract class Dog1{
    String breed;
    public void bark(){
        System.out.println("bark!");
    }
    public abstract void poop();
}

class Dog2 extends Dog1{
    public void poop(){
        System.out.println("Dog pooped!");
    }
}
public class AbstractTutorial {
    public static void main(String[] args) {
        Dog2 dog2=new Dog2();
        dog2.bark();
        dog2.poop();


    }

}
