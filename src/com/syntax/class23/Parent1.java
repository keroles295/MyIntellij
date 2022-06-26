package com.syntax.class23;

public class Parent1 {
    public static void eat(){
        System.out.println("I like to eat seafood");
    }
    public static void sleep(){
        System.out.println("I like to sleep 7 hours");
    }
    public static void activity(){
        System.out.println("Go to Beach");
    }
}
class Child extends Parent1{
    public static void activity(){
        System.out.println("I am very religious");
    }
}
class parent1Test{
    public static void main(String[] args) {
        //Child pito= new Child();
        //pito.sleep();
        //pito.eat();
        //pito.activity();
        Child.sleep();
        Child.activity();
        Parent1.activity();
        Child.activity();

    }
}

