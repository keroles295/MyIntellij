package com.syntax.class19;
class Animal{

    String name;
    String nreed;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name"+name+" color "+color);
    }
}

public class Dog extends Animal {

    Dog(String name, String color){
        this.name=name;//using extendes keyword to be able to access the name and color from the animal class
        this.color=color;
    }


}
class Cat extends Animal{
    Cat(String name, String color){
        this.name=name;
        this.color=color;
    }



}
