package DayilyAndReplitPractice;

public class SuperDemo {
    public static void main(String[] args) {

        Chair obj=new Chair();
        obj.printColor();
    }
}
class Wood{
    String color="Blue";
}
class Furniture extends Wood{
    String color="Black";
}

class Chair extends Furniture{
    String color="grey";
    void printColor(){
        String color="white";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }
}

