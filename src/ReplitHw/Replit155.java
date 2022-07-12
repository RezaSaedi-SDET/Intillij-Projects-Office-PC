package ReplitHw;

public class Replit155 {
}

class A155{
    String word;
    A155(){
    }
    void printInfo(){
        System.out.println("I");
    }

}

class B155 extends A155{
    String word;
    void printInfo(){
        System.out.println("am");
    }
}

class C155 extends B155{
    String word;
    void printInfo(){
        System.out.println("a tester");
    }
}

class Tester155{
    public static void main(String[] args) {
        C155 obj155=new C155();
        obj155.printInfo();
    }
}

