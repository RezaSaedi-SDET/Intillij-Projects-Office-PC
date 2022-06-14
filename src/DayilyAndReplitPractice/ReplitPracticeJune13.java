package DayilyAndReplitPractice;

import java.util.Locale;
import java.util.Scanner;

public class ReplitPracticeJune13 {




    public static void main(String[] args) {

        //For you to do:
        //
        //   You have Scanner class to input string value.
        //
        //   If language is Java it should print the:
        //
        //   "Java is a programming language".
        //
        //   If language is C it should print the:
        //
        //   "C is a procedural programming language"
        //
        //      If language is C++ it should print the:
        //
        //       "C++ is a middle-level programming language"
        //
        //       If any other should print:
        //
        //       "Doesn't match any programming language"
        //

        Scanner input=new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language=input.nextLine();

//        if(language.equalsIgnoreCase("java")){
//            System.out.println(language+" is a programming language.");
//        } else if (language.equalsIgnoreCase("C")){
//            System.out.println(language.toUpperCase().substring(0)+" is a procedural programming language");
//        } else if (language.equalsIgnoreCase("C++")){
//            System.out.println(language.toUpperCase().substring(0)+" is a middle-level programming language");
//        }else {
//            System.out.println("Doesn't match any programming language");
//        };




//        Scanner input=new Scanner(System.in);
//
//        System.out.println("Name of fruit:");
//        String fruit=input.nextLine();
//        System.out.println(" The first 3 letters of "+fruit+" is "+fruit.substring(0,3));


        //For you to do:
        //Create a String given="I love Java classes at Syntax"
        //Retrieve 2 Strings using substring method from given String and print them
        //Expected Output:
        //classes at Syntax
        //I love Java

//        String txt="I love Java classes at Syntax";
//        System.out.println(txt.substring(12,29));
//        System.out.println(txt.substring(0,11));


        //For you to do: String “abracadabra alakazam”;
        //
        //Print out the position of the first occurrence of "c".
        //Print out the position of the first occurrence of " ".
        //Print out the position of the first occurrence of the variable target1.
        //Print out the position of the first occurrence of the variable target2.

//        String str = "abracadabra alakazam";
//        String target1 = "dab";
//        String target2 = "ABRA";
//
//        System.out.println(str.indexOf("c"));
//        System.out.println(str.indexOf(" "));
//        System.out.println(str.indexOf(target1));
//        System.out.println(str.indexOf(target2));


        //For you to do:
        //
        //Validate if the string ends with "u" prints the boolean value accordingly.
        //
        //Validate if the string ends with "world" prints the boolean value accordingly.
        //
        //Validate if the string ends with "are" prints the boolean value accordingly.
        //
        //Validate if the string ends with "you" prints the boolean value accordingly.

//        String s1="hello how are you";
//        System.out.println(s1.endsWith("u"));
//        System.out.println(s1.endsWith("world"));
//        System.out.println(s1.endsWith("are"));
//        System.out.println(s1.endsWith("you"));


        //For you to do:
        //
        //Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES
        //
        //Create String str2= SYNTAX TECHNOLOGIES and convert into syntax technologies
        //
        //Expected Output:
        //SYNTAX TECHNOLOGIES
        //syntax technologies

//        String str1=new String("syntax technologies");
//        String str2=new String("SYNTAX TECHNOLOGIES");
//
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.toLowerCase());


        //For you to do:
        //
        //Create a String named s1 = "hello" check weather string is empty or not
        //
        //Create a String named s2 = "" check weather string is empty or not
        //
        //Expected Output:
        //
        //false
        //true

//        String s1=new String("hello");
//        String s2=new String("");
//
//        System.out.println(s1.isEmpty());
//        System.out.println(s2.isEmpty());


        //For you to do:
        //Create a String "name" and assign the value "Timmy" to it.
        //Find out how many characters are there in the given String.

//        String name =new String("Timmy");
//        System.out.println(name.length());


    }
}
