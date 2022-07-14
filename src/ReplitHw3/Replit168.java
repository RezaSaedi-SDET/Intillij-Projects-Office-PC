package ReplitHw3;

public class Replit168 {
    /*
    Question 168
    For you to do:

    Create an instance final method that will reverse a String and return that new String

    Call method from the main method

    Expected Output:

    olleh
     */

    public static void main(String[] args) {

        final StringBuilder reversWord=new StringBuilder("hello");
        reversWord.reverse().toString();
        System.out.println(reversWord);


    }
}
