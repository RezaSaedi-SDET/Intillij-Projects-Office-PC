package DayilyAndReplitPractice;

import java.util.ArrayList;

public class ArrayListProj {
    public static void main(String[] args) {
        String[] fruit=new String[3];
        fruit[0]="Mango";
        fruit[1]="Apple";
        fruit[2]="Strawberry";
        System.out.println(fruit[1]);

        ArrayList fruitList=new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        System.out.println(fruitList);
    }
}
