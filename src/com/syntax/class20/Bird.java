package com.syntax.class20;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name "+name+"Color"+color);
    }
    Bird(String name, String color, int age, double weight){
        this.age=age;
        this.color=color;
        this.name=name;
        this.weight=weight;
    }
}
class Parrot extends Bird{
    Parrot(String name, String color, int age, double weight){
        super(name, color, age, weight);//calling the parent class constructors by write super keyword.
        //this.age=age;
        //this.color=color;
        //this.name=name;
        //this.weight=weight;
    }
    void printInfo(){
        System.out.println("Name "+name+"Color"+color);
    }
}
class Sparrow extends Bird{
    Sparrow(String name, String color, int age, double weight){
        super(name, color, age, weight);
        //this.age=age;
        //this.color=color;
        //this.name=name;
        //this.weight=weight;
    }
    void printInfo(){
        System.out.println("Name "+name+"Color"+color);
    }
}
