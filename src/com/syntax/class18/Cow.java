package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;
    Cow(String breed,String color, int age, double weight){
        //when we have same name variable as local and as instance a class always local variable are preferred
        //over instance variable by Java in block of code.
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;

    }
    String getCowIfo(){
        return " Breed "+breed+" Color "+color+" age "+age+" Weight "+weight;
    }
}
