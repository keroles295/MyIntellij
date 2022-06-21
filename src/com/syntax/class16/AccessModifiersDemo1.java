package com.syntax.class16;

public class AccessModifiersDemo1 {
    private  String passWord="pass1234";
    int SSN=2144531;
    String name="Amelia";


    public static void main(String[] args) {
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.passWord);
        System.out.println(ac.SSN);
        System.out.println(ac.name);
    }


}
