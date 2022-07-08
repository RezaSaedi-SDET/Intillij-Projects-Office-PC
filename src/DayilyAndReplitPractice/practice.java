package DayilyAndReplitPractice;

public class practice {
    public String name;
    private int salary;
    String department;

    public void printName(){
        System.out.println("name "+name);
    }
    private void printSalary(){
        System.out.println("salary "+salary);
    }
    void printDepartment(){
        System.out.println("department "+department);

    }

    public static void main(String[] args) {
        practice obj=new practice();
        obj.department="SDET";
        obj.name="jack";
        obj.salary=120000;

        obj.printDepartment();
        obj.printName();
        obj.printSalary();
    }
}
