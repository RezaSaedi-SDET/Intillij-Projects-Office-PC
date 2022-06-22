package DayilyAndReplitPractice;

public class Phone {

    String brand;
    String model;
    String weight;
    String screenSize;
    String price;

    void screenQuality(){
        System.out.println("it shows nice!");
    }
    void charge(){
        System.out.println("It save charge for 24 hours");
    }
    void speed (){
        System.out.println("It works pretty fast");
    }

    public static void main(String[] args) {

        Phone obj=new Phone();
        obj.brand="Samsung";
        obj.model="note 2022";
        obj.weight="50gr";
        obj.screenSize="4inx10in";
        obj.price="$1000";
        obj.screenQuality();
        obj.charge();
        obj.speed();




    }
}
