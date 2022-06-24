package DayilyAndReplitPractice;

public class ReplitHwJune23 {

    /*
    Write a method header with the following specs:

    Returns:

    a String
    Name:

    censorLetter
    Parameters:

    a String
    a char

    Copied!
    Then complete the method by programming the following behavior

    Replace all instances of given character with a "*" within the given String.
    See below examples.
    Examples:

    censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    censorLetter("trick or treat",'t') ==> "*rick or *rea*"
     */

    void censorLetter (String x, char y){

    }

    public static void main(String[] args) {
        ReplitHwJune23 obj=new ReplitHwJune23();



    }


    /*
    Write a method header on line two with the following specs:

    Returns:

    a String
    Name:

    spaceOut
    Parameters:

    a String
    Then complete the method by programming the following behavior

    Insert spaces after every character in the String s, then return the new string.
    See below examples (note the space at the end as well).
    Examples:

    spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y "
     */

//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("hello");
//        for (int i=1; i<sb.length(); i+=2)
//            sb.insert(i, ' ');
//        System.out.println(sb.toString());
//    }



    /*
    Create a method with the following specs:

    Returns:

    an integer
    Name:

    sumEvenToX
    Parameters:

    an integer called "x"
    Purpose:

    calculate the sum of the EVEN integers from 1 to x (including x)
    Examples:

    sumEvenToX(5) ==> 6
    sumEvenToX(8) ==> 20
     */

//    void sumEvenTox(){
//        int result = 0;
//        for (int x=0;x<=5;x++){
//            if (x%2==0){
//                result+=x;
//            }
//        }
//        System.out.println(result);
//
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune23 obj=new ReplitHwJune23();
//        obj.sumEvenTox();
//    }

    /*
    Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false

    ( Return false if one or both given numbers are not even)

    Examples:

    bothEven(4,6) ==> true
    bothEven(3,4) ==> false
    bothEven(-1,1) ==> false
    Expected Output:

    false
     */

//    void returnTrue(int number1,int number2){
//        if (number1%2==0 && number2%2==0){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune23 obj=new ReplitHwJune23();
//        obj.returnTrue(4,6);
//        obj.returnTrue(3,4);
//        obj.returnTrue(-1,1);
//    }




    /*
    Create a method that will accept a String as a parameter and return new String all in upper case

    Call method

    Expected Output:

    TEST
     */

//    void text(String x){
//        System.out.println(x.toUpperCase());
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune23 obj=new ReplitHwJune23();
//        obj.text("test");
//
//    }


  /*
  Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

for the addition method add two numbers to make 30

for multiplication multiply two numbers to make 30

for Subtraction subtract two numbers to equal 20

Expected Output:

Addition 30
Multiplication 30
Subtraction 20
   */

//    int multi(int x,int y){
//       return x*y;
//    }
//
//    int add(int x, int y){
//        return x+y;
//    }
//
//    int sub(int x, int y){
//        return x-y;
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune23 num=new ReplitHwJune23();
//        int number1=num.add(2,28);
//        int number2=num.multi(2,15);
//        int number3=num.sub(22,2);
//        System.out.println("Addition "+number1);
//        System.out.println("Multiplication "+number2);
//        System.out.println("Subtraction "+number3);
//    }



    /*
    Create a method in which you will be printing numbers from 1 to 10

    Call the method in the main method

    Expected Output:

    1
    2
    3
    4
    5
    6
    7

    Copied!
    8
    9
    10
     */
//    public static void printNumbers(){
//        for (int i=0;i<=10;i++){
//
//            System.out.println(i);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune23.printNumbers();

//    }
}
