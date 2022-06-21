package com.syntax.class18;

public class HW4 {
//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.
    String name;
    String country;
    int age;
    public HW4(){
        System.out.println("I will do my best to make my son happy");
    }
    public HW4(String myName, String myCountry, int myAge){
        name=myName;
        country=myCountry;
        age=myAge;

    }
    public void printInfo(){
        System.out.println("My name is "+name+". I am from "+country+". Iam "+age+" years old.");
    }




}
