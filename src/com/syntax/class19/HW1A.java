package com.syntax.class19;

public class HW1A {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String name;
    String country;
    int age;

    public void printInfo() {
        System.out.println(name + " is " + age + "years old. he lives in " + country);
    }
}
class B extends HW1A{}
class C extends B{}

