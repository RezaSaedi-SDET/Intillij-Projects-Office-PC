package ReplitHw4;

public class Replit182 {
    /*
    Create the a Person class with the following:

    Class Variables

    firstname
    lastname
    birthmonth
    birthday
    birthyear
    String ssn
    Constructor

    The main constructor should take in all values and assign them to their respective private class variables

    Methods

    Create a public getters to access all the variables.

    Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format. For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

    in Main Class.

    Instantiate and object of Person and provide values. follows below outputs for values.

    using getter and method print them separately.

    Note: Read carefully the steps.

    Expected Output:

    John
    Doe
    10/25/1900
    123-45-6789
         */
}

class Person182{
    private String firstName="John";
    private String lastName="Doe";
    private int birthMonth=10;
    private int birthDay=25;
    private int birthYear=1900;
    private String SSN="123-45-6789";

    Person182(String firstName,String lastName,int birthMonth,int birthDay,int birthYear,String SSN){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.SSN=SSN;
    }

    public Person182() {

    }

    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }

    int getBirthMonth(){
        return birthMonth;
    }

    int getBirthDay(){
        return birthDay;
    }

    int getBirthYear(){
        return birthYear;
    }

    String getSSN(){
        return SSN;
    }

}

class Main182{
    public static void main(String[] args) {
        Person182 obj182=new Person182();
        System.out.println(obj182.getFirstName());
        System.out.println(obj182.getLastName());
        System.out.print(obj182.getBirthMonth()+"/");
        System.out.print(obj182.getBirthDay()+"/");
        System.out.println(obj182.getBirthYear());
        System.out.println(obj182.getSSN());

    }
}
