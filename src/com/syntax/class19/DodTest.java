package com.syntax.class19;

public class DodTest {
    public static void main(String[] args) {
        Cat cat1= new Cat("Kitty", "Gray");
        cat1.printInfo();//Cat class does not have this methods but because we are using inheritance
        //so we can use methods from the Parent class
        Dog dog1=new Dog("Max", "Black");
        dog1.printInfo();
    }
}
