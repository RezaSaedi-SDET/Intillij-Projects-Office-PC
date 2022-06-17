package DayilyAndReplitPractice;

import java.util.Locale;
import java.util.Scanner;

public class ReplitPracticeJune13 {



    public static void main(String[] args) {

        /*
        There is a code that takes input as a String.

        Write a program that will print out only vowels of that string

        Sample input/outputs:

        In: howdyho
        oo
        In: huehuehuehue
        ueueueue
        In: poopoo what idk what im doing
        ooooaiaioi
         */

//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        for (int i=0;i<word.length();i++){
//            if (word.charAt(i)=='a' || word.charAt(i)=='A'|| word.charAt(i) == 'e' || word.charAt(i) == 'E' || word.charAt(i) == 'O'
//            ||word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'U'){
//                System.out.print(word.charAt(i));
//
//            }else {
//                System.out.println("");
//            }
//        };


//        Scanner input=new Scanner(System.in);
//        String [] array= new String[5];
//        array[0]=input.nextLine();
//        array[1]=input.nextLine();
//        array[2]=input.nextLine();
//        array[3]=input.nextLine();
//        array[4]=input.nextLine();
//
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i].substring(0,3));
//        };



        /*
        For you to do:

        Create an array of names that will hold 5 String elements.

        Names must be taking from a user.

        Print out the first three characters of each element of the array, one per line.

        Note: every array element must be at least 3 characters long.

        Input Example:

        John

        Jane

        Jimmy

        Mike

        Emily

        Expected Output:
        Joh

        Jan

        Jim

        Mik

        Emi
         */




        /*
        Given the following inputs:

        String s;
        Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.

        Sample input/outputs:

        In: hello
        h e l l o
        In: covert
        c o v e r t
        In: blasphemy
        b l a s p h e m y
         */
//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String s = inp.nextLine();
//        for (int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i)+" ");
//        };




        /*
        Inputs:

        String word;

        Copied!
        Write a for loop that will loop through every character of a word and print out each character, each on a separate line

        Sample inputs/outputs:

        In: hello
        h
        e
        l
        l
        o
        In: zimbabwe
        z
        i
        m
        b
        a
        b
        w
        e
        In: wow!
        w
        o
        w
        !
         */

//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        for (int i=0;i<word.length();i++){
//            System.out.println(word.charAt(i));
//        };


        /*
        Inputs:

        String word;

        Copied!
        Write a for loop that will print out every other letter in a String, starting with the first letter. These letters should be printed all on one line with no space in between.

        Sample input/outputs

        In: hello
        hlo
        In: SSyynnttaaxxTTeecchhnnoollooggiieess
        SyntaxTechnologies
         */
//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word = inp.nextLine();
//        for(int i=0;i<word.length();i++){
//            if(i%2!=0){
//                System.out.print("");
//            }else {
//                System.out.print(word.charAt(i));
//            }
//        };










        /*
        Given the following inputs:

        String s;
        Write a for loop that will print out the reverse of the string.

        Sample input/outputs:

        In: manhattan
        nattahnam
        In: processor
        rossecorp
        In: racecar
        racecar
         */

//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String s = inp.nextLine();
//        String reversword="";
//
//        for (int i=(s.length()-1);i>=0;i--){
//            reversword=reversword+s.charAt(i);
//        };
//
//        System.out.println(reversword);


        


        /*
        Write code that will take in a String input and check to see if it is a palindrome or not.

        A palindrome means that the characters are the same forwards and backwards, ignoring spaces.

        Examples of palindromes:

        racecar
        was it a car or a cat I saw
        never odd or even
        rats live on no evil star
        Your check should be case insensitive too. For example, "Bob" is a palindrome, despite the first B being capitalized.

        Your program will print out "true" if it's a palindrome and "false" if not.
         */
//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String givenString = inp.nextLine();
//        String reverseWord="";
//        int givenStringLength=givenString.length();
//        for (int i=(givenStringLength-1); i>=0;--i){
//            reverseWord=reverseWord+givenString.charAt(i);
//        };
//
//        if (givenString.toLowerCase().equals(reverseWord.toLowerCase())){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }




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

//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter any programming language");
//        String language=input.nextLine();

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
