package ReplitHw4;

public class Replit179 {
    /*
    Create Class EncapsulationDemo that will have 2 variables empName and empAge; Create the getter/setter methods for each variable.

    In Main Class and main method

    Using setter methods assign the values as "Mario" and "32"

    Using getter methods print the values as below outputs.

    Expected Output:

    Employee Name: Mario
    Employee Age: 32
     */
}

class Main179{
    public static void main(String[] args) {
        EncapsulationDemo179 obj179=new EncapsulationDemo179();
        obj179.setEmpName("Mario");
        System.out.println("Employee Name: "+obj179.getEmpName());
        obj179.setEmpAge(32);
        System.out.println("Employee Age: "+obj179.getEmpAge());

    }

}

class EncapsulationDemo179{
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