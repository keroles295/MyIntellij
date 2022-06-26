package com.syntax.class23;

public class Animal {
    Animal(){
        System.out.println("Parent");
    }
    void eat(){
        System.out.println("all the animals eat");
    }

}
class Panda extends Animal{
    //no other class can inherted from animal class because it is declared final
    void eat(){
        System.out.println("all the animals eat");
    }
    Panda (){
        System.out.println("Child");
    }
}
class Testers{
    public static void main(String[] args) {
        new Panda();

    }
}
