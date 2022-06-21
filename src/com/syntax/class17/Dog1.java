package com.syntax.class17;

public class Dog1 {
    String name;
    String bread;
    String color;
    int age;
    double weight;
    Dog1 (String doName, String doBread, String doColor){
        name=doName;
        bread=doBread;
        color=doColor;

    }
    void printinfo(){
        System.out.println(name+bread+color+weight);
    }

    public static void main(String[] args) {


    }

}
