package DayilyAndReplitPractice;

public class ReplitHwJune30 {


    //Question 139
    /*
    Create a method that will be available to all classes in your project with following specifications:

    Returns:

    a String
    Name:

    alphabetical
    Parameters:

    a String called str
    Purpose:

    Return a string that is composed of each letter as long as the letter is later on in the alphabet
    than its previous one.  You can assume actual parameters are lowercase.
    See below examples.
    Additional Info:

    You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater". Examples:

    'a' < 'b' ==> True
    'a' < 'a' ==> False

    Copied!
    'a' > 'b' ==> False
    Examples:

    alphabetical("hello") ==> "hlo"
    alphabetical("software") ==> "stwr"
    alphabetical("language") ==> "lnug"
    Expected Output:

    hlo
    stwr
    lnug
     */

//    public static String alphabetical(String str){
//        for (int i=0;i<str.length();i+=2){
//            System.out.println(i);
//
//        }
//        return str;
//    }
//
//    public static void main(String[] args) {
//        alphabetical("hello");
//    }

    /*
    In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.

    All methods should be accessible by class name

    Call methods of Another class inside Main class

    Expected Output:

    default
    protected
    public
     */
//    static class AnotherClass{
//        String d="default";
//        protected String p="protected";
//        public String pu="public";
//    }
//
//    public static void main(String[] args) {
//        AnotherClass obj=new AnotherClass();
//        System.out.println(obj.d);
//        System.out.println(obj.p);
//        System.out.println(obj.pu);
//
//    }

    /*
    For you to do

    In main class please declared the variables using different access modifiers that will hold value for:

    name
    city
    name of the school
    batch number
    Create a method to display details in following format:

    My name is ___ and I live in ___. I study at ___ in batch ___

    Assign values to the variables and execute method display

    Expected Output:

    My name is John and I live in Miami. I study at Syntax in batch 9
     */


//    String name="John";
//    public String city="Miami";
//    protected String schoolName="Syntax";
//    private String batchNumber="9";
//    public static void main(String[] args) {
//        ReplitHwJune30 obj=new ReplitHwJune30();
//        String n=obj.name;
//        String c= obj.city;
//        String s=obj.schoolName;
//        String b=obj.batchNumber;
//        System.out.println("My name is "+n+" and I live in "+c+". I study at "+s+" in batch "+b);


//    }

    /*
    For you to do:

    Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

    In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs, please make sure they are in the same order that is printed below.

    Expected Output:

    This is Private Method
    This is Default Method
    This is Protected Method
    This is Public Method
     */

//    private String privateMethod(String sentence1){
//
//        return sentence1;
//    }
//
//     String defaultMethod(String sentence2){
//
//        return sentence2;
//    }
//
//    protected String protectedMethod(String sentence3){
//
//        return sentence3;
//    }
//
//    public String publicMethod(String sentence4){
//
//        return sentence4;
//    }
//
//    public static void main(String[] args) {
//        ReplitHwJune30 obj=new ReplitHwJune30();
//        String a=obj.privateMethod("This is Private Method");
//        String b=obj.defaultMethod("This is Default Method");
//        String c=obj.protectedMethod("This is Protected Method");
//        String d=obj.publicMethod("This is Public Method");
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//    }


    //Question 135:
    /*
    Write a method with the following specs:

    Returns:

    a String
    Name:

    surround
    Parameters:

    a String called s
    a String called search_term
    Then complete the method by programming the following behavior

    Return a new String built from s that has every instance of the search term surrounded by parentheses
    See below examples.

    Copied!
    Examples:

    surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
    surround("technology",'o') ==> "techn(o)l(o)gy"
     */



    /*
    Write a method with the following specs:

    Returns:

    an integer
    Name:

    countVowels
    Parameters:

    a String called s
    Purpose:

    count the number of vowels in the string s.  Assume s is all lowercase.
    Examples:

    countVowels("obama") ==> 3
    countVowels("happy friday! i love weekends") ==> 9
     */

//    public static int countVowels(String s){
//        int count=0;
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countVowels("obama"));
//        System.out.println(countVowels("happy friday! i love weekends"));
//    }

    //Question 133
    /*
    Create a static method with the following specs:

    Returns:

    an integer
    Name:

    countA
    Parameters:

    a String called s
    Purpose:

    count the number of occurrences of 'a' or 'A' within s
    Examples:

    countA("aaa") ==> 3
    countA("aaBBdf8k3AAadnklA") ==> 6
    Hint: How do you write a for loop to loop through every letter of a string? You've done this multiple times already :)
     */

//    public static int countA(String a, char b){
//        int count=0;
//        for (int i=0;i<a.length();i++){
//            if (a.charAt(i)==b){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(countA("aaBBdf8k3AAadnklA",'a'));
//
//
//    }



    /*
    Question 132

    For you to do:

    Complete the reduce10 method by making it subtract 10 from every element of the double array nums.

    The method should static and it should return a new 2D array object

    Print values from new array in the format below input

    1 2 3 4
    4 5 6 7
    1 3 5 7
    Expected Output:

    -9 -8 -7 -6
    -6 -5 -4 -3
    -9 -7 -5 -3
     */



//    static void reduce10() {
//        int[][] nums = {
//                {1, 2, 3, 4},
//                {4, 5, 6, 7},
//                {1, 3, 5, 7}
//        };
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                int a=10;
//                int result = nums[i][j] - a;
//
//                    System.out.print(result+" ");
//                }
//            }
//
//        }
//
//
//    public static void main(String[] args) {
//        reduce10();
//    }



    /*
    Write a method header on line two with the following specs:

    Returns:

    a String
    Name:

    thirdLetter
    Parameters:

    a String called s
    Then complete the method by programming the following behavior

    Returns every 3rd letter of the String s,
    starting from the first letter.
    See below examples.
    Examples:

    thirdLetter("hello there") ==> "hltr"
    thirdLetter("technology") ==> "thly"
     */
//    String thirdLetter(String s){
//
//        for (int i=0;i<s.length();i++){
//            if (i%3==0) {
//                System.out.print(s.charAt(i));
//            }
//            }
//        return s;
//        }
//
//    public static void main(String[] args) {
//        ReplitHwJune30 obj=new ReplitHwJune30();
//        obj.thirdLetter("hello there");
//        System.out.println();
//        obj.thirdLetter("technology");
//    }
    }

