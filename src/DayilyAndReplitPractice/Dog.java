package DayilyAndReplitPractice;

public class Dog {
    String breed;
    String size;
    String color;
    void bark(){
        System.out.println("this dog barks every morning");
    }
    void run(){
        System.out.println("this dog run very quick");
    }
    void learning(){
        System.out.println("this dog is so smart");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();

        dog1.breed="german";
        dog1.color="black";
        dog1.size="large";
        dog1.bark();
        dog1.run();
        dog1.learning();


        dog2.breed="german";
        dog2.color="black";
        dog2.size="large";

        dog3.breed="german";
        dog3.color="black";
        dog3.size="large";



    }
}
