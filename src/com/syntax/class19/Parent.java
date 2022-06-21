package com.syntax.class19;

public class Parent {
    String name="Nazeer";
    double money=100000;
}
class Child extends Parent{
    void pintInfo(){
        System.out.println("My full name is Keroles "+name);
    }
    void buyCar(){
        System.out.println("My Father helped me to buy car, he gave me"+money);
    }
}
class Tester {
    public static void main(String[] args) {
        Child child1= new Child();
        child1.pintInfo();
        child1.buyCar();
    }
}
