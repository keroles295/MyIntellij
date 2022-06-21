package com.syntax.class16;

public class Dog {

 //static   String name;
 //If we know something will stay the same until the end of the class so we use static variable
    String name;
 String color;
 static int dogLegs=4;




    public static void main(String[] args) {
        Dog dog1=new Dog(); //creating an objoect of Dog class
        dog1.name="Tomy";
        dog1.color="Brown";

        Dog dog2=new Dog();
        dog2.name="Fiblo";
        dog2.color="Black";
        Dog dog3=new Dog();
        dog3.name="Rad";
        dog3.color="Blue";
        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);

    }



}
