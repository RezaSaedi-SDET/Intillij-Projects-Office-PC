package ReplitHw4;

import java.lang.annotation.Annotation;

public class Replit177 {
    /*
    Step 1: Create Interface as Outputs

    Step 2: Create one method with below details

    First Methods: return type void, method name display, parameters -> result (choose the datatype as required)
    Step 3: Create Interface as Functions

    Step 4: Inherit to Outputs

    Step 5: Create 4 methods as below.

    return type double, method label adding, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    return type double, method label subtracting, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    return type double, method label multiply, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    return type double, method label dividing, parameters -> firstNumber , SecondNumber (choose the datatype as required)
    Step 6: In Main Class inherit to Functions Interface.

    Step 7: Provide implementation logic to unimplemented methods.

    Step 8: complete the body of all the methods as below

    Display method to print the result parameter as shown below in Outputs.
    Adding, Subtracting, Multiply, dividing each will have the logics to do simple mathematic operation and return the result.
    Step 9: Create the main method inside the main method declare below variables.

    double firstNumber = 100.00;
    double secondNumber = 20.00;
    Step 10: Instantiate the object of Main class and call the methods one by one to print the result and sequence of shown below in output.
     */
}

interface Outputs177{
    void display();


}

interface function177 extends Outputs177{
    default double adding177(double firstNumber, double SecondNumber){
        double add=firstNumber+SecondNumber;

        return add;
    }
    default double subtracting177(double firstNumber, double SecondNumber){
        double sub=firstNumber-SecondNumber;

        return sub;
    }

    default double multiplying177(double firstNumber, double SecondNumber){
        double multi=firstNumber*SecondNumber;

        return multi;
    }

    default double dividing177(double firstNumber, double SecondNumber){
        double divide=firstNumber/SecondNumber;

        return divide;
    }

}

class Main177 implements function177 {
    public static void main(String[] args) {
        Main177 obj177=new Main177();
        double add177=obj177.adding177(100.00,20.00);
        System.out.println("Result is ::: "+add177);

        double sub177=obj177.subtracting177(100.00,20.00);
        System.out.println("Result is ::: "+sub177);

        double multiple177=obj177.multiplying177(100.00,20.00);
        System.out.println("Result is ::: "+multiple177);

        double divide177=obj177.dividing177(100.00,20.00);
        System.out.println("Result is ::: "+divide177);

    }


    @Override
    public void display() {
        System.out.println();
    }

    @Override
    public double adding177(double firstNumber, double SecondNumber) {
        return function177.super.adding177(firstNumber, SecondNumber);
    }

    @Override
    public double subtracting177(double firstNumber, double SecondNumber) {
        return function177.super.subtracting177(firstNumber, SecondNumber);
    }

    @Override
    public double multiplying177(double firstNumber, double SecondNumber) {
        return function177.super.multiplying177(firstNumber, SecondNumber);
    }

    @Override
    public double dividing177(double firstNumber, double SecondNumber) {
        return function177.super.dividing177(firstNumber, SecondNumber);
    }
}
