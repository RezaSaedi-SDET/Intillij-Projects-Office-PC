package ReplitHw4;

public class Replit181 {
    /*
    Create Class Account

    Create the below variables:

    acc_no;
    name;
    email;
    double amount;
    Create the getter/setter methods for each variable.

    In Main Class and the main method.

    Using setter methods assign the values as:

    acc_no = 7560504000

    name = Sumair

    email = sumair@syntax.com

    amount = 50000.0

    Using getter methods print the values as below output.

    Expected Output:

    7560504000 Sumair sumair@syntax.com 50000.0
     */
}

class Main181{
    public static void main(String[] args) {
        Account181 obj181=new Account181();
        obj181.setAcc_no(7560504000l);
        System.out.print(obj181.getAcc_no()+" ");

        obj181.setName("Sumair");
        System.out.print(obj181.getName()+" ");

        obj181.setEmail("sumair@syntax.com");
        System.out.print(obj181.getEmail()+" ");

        obj181.setDoubleAmount(50000.0);
        System.out.print(obj181.getDoubleAmount());
    }
}

class Account181{
    private long acc_no;
    private String name;
    private String email;
    private double doubleAmount;

    void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    long getAcc_no(){
        return acc_no;
    }

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    void setEmail(String email){
        this.email=email;
    }
    String getEmail(){
        return email;
    }

    void setDoubleAmount(double doubleAmount){
        this.doubleAmount=doubleAmount;
    }
    double getDoubleAmount(){
        return doubleAmount;
    }

}

