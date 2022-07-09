package ReplitHw;

public class ShoppingStore {

    /*
    Question (148)
    In ShoppingStore class:

    Create variables as below.

    item,
    price,
    quantity
    Create a constructor to initialize instance variables.

    Create a method with name itemTotalPrice.

    write a logic to to calculate the total values of items in stock. and print the result.

    return the total value.

    In Main Class.

    Create two Object of ShoppingStore and pass the parameters to Constructor.

    then using each object call the method itemTotalPrice.

    Store the returned value of each object.

    Calculate sum of both object and print the result.

    Output:

    Blanket Total Value 99.98
    Mattress Total Value 439.18
    You purchased 539.16 Today
    Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
     */

    String item;
    double price;
    String quantity;

    ShoppingStore(String item, double price, String quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

    ShoppingStore(String item, double price){
        this.item=item;
        this.price=price;
    }

    ShoppingStore(double price){
        this.price=price;
    }

    void ShoppingInfo1(){
        System.out.println(item+" Total Value "+price);
    }

    void ShoppingInfo2(){
        System.out.println("You purchased "+price+" Today");
    }

    public static void main(String[] args) {
        ShoppingStore obj1=new ShoppingStore("Blanket",99.98);
        obj1.ShoppingInfo1();
        ShoppingStore obj2=new ShoppingStore("Mattress",439.18);
        obj2.ShoppingInfo1();
        ShoppingStore obj3=new ShoppingStore(539.16);
        obj3.ShoppingInfo2();


    }

}
