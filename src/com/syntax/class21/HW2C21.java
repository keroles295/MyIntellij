package com.syntax.class21;

public class HW2C21 {
    //Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    // then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example,
    // if we pass "Java", then "I love Java" should be printed.
}
class Programming {
    public void nothinG(){
        System.out.println("I love programming languages");
    }
    public void nothinG(String str){
        System.out.println("I live "+str);
    }

}
class test{
    public static void main(String[] args) {
        Programming pito=new Programming();
        pito.nothinG();
        pito.nothinG("Java");

    }
}


