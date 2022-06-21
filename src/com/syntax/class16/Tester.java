package com.syntax.class16;

public class Tester {
    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.name);
       // System.out.println(ac.passWWord);//we can not access because it was a private variable
        System.out.println(ac.SSN);
    }
}
