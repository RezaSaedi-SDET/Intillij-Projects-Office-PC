package ReplitHw4;

public class Replit180 {
    /*
    Create Class EncapsulationDemo

    create two variable as shown below.

    private String empName=John;

    private int empAge=30;

    Create only getters methods for each variable.

    Print the values of each variable as shown below.

    Expected Output:

    Employee Name: John
    Employee Age: 30
     */
}

class EncapsulationDemo180{

    private String empName="John";

    private int empAge=30;

    String getEmpName(){
        return empName;
    }

    int getEmpAge(){
        return empAge;
    }
}

class Main180{
    public static void main(String[] args) {
        EncapsulationDemo180 obj180=new EncapsulationDemo180();
        System.out.println("Employee Name: "+obj180.getEmpName());
        System.out.println("Employee Age: "+obj180.getEmpAge());
    }
}
