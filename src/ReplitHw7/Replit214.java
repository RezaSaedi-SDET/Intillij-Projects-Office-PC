package ReplitHw7;

public class Replit214 {
    /*
    ** this file should contain student lesson instructions **

_ students will see these instructions in a read-only workspace tab _

Steps
Use Markdown to format your instructions.

For example, here is a code block in java10_beta

public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
Include an image by placing it in the assets folder.

For example, here is the Replit logo:

alt text
     */
    public static void main(String[] args) {
        int grade = 91;
        if (grade > 90) {
            System.out.println(new SyntaxStudentException("You are an exceptionally awesome student"));
        } else {
            System.out.println(new SyntaxStudentException("You are a great student"));
        }
    }
}
class SyntaxStudentException extends RuntimeException {
    SyntaxStudentException(String errorMessage) {
        super(errorMessage);
    }
}
