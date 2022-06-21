package com.syntax.class21;

import static com.syntax.class21.HW3C21.myOverload;

public class HW3C21 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result
    static void myOverload( int a, double v){
        System.out.println("This number one");
    }
    static void myOverload( String str2, String str){
        System.out.println("This number two");
    }
    static void myOverload( int a, String str){
        System.out.println("This number three");
    }
}
class HTestW{
    public static void main(String[] args) {
        myOverload("try", "try again");
        myOverload(25, "go");
        myOverload(11, 2.4);
    }
}
