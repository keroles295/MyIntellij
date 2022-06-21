package com.syntax.class21;

public class Animals {
    String name;
    String color;
    String breed;
    int age;

   public Animals(String name, String color, String breed, int age) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name "+name+" color "+color+" Breed "+breed+" age "+age);
    }

}
class Doge extends Animals{

    public Doge(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }
}
class Cate extends Animals{
    public Cate (String name, String color, String breed, int age){
        super(name, color, breed, age);
    }
}
