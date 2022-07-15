package ReplitHw4;

public class Replit178 {
    /*
    Create Class EncapsulationDemo

    create two variable as shown below.

    private String empName;

    private int empAge;

    Create the getter/setter methods for each variable.

    In Main Class and main method.

    Using setter methods assign the values as "John" and "30"

    Using getter methods print the values as below outputs.

    Expected Output:

    Employee Name: John
    Employee Age: 30
     */

}

class Main178{
    public static void main(String[] args) {
        EncapsulationDemo obj178=new EncapsulationDemo();
        obj178.setEmpName("John");
        System.out.println("Employee Name: "+obj178.getEmpName());

        obj178.setEmpAge(30);
        System.out.println("Employee Age: "+obj178.getEmpAge());

    }
}

class EncapsulationDemo{
    private String empName;
    private int empAge;

    void setEmpName(String empName){
        this.empName=empName;
    }
    String getEmpName(){
        return empName;
    }

    void setEmpAge(int empAge){
        this.empAge=empAge;
    }

    int getEmpAge(){
        return empAge;
    }

}
