package DayilyAndReplitPractice;

public class MainCapsulation {
    public static void main(String[] args) {
        StudentEncapsulation se=new StudentEncapsulation();
        se.setName("Suzie");
        System.out.println();
        System.out.println(se.getName());
        se.setAge(25);
        System.out.println(se.getAge());

    }
}
