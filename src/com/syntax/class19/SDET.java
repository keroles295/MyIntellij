package com.syntax.class19;

public class SDET extends Human {
    boolean goodJava;
    SDET(String name, String eyeColor, int age, boolean goodJava){
        this.name=name;
        this.eyeColor=eyeColor;
        this.age=age;
        this.job=job;
        this.goodJava=goodJava;
    }
    void printInfo(){
        System.out.println("My name is "+name+" i do "+job+" am I good with java "+goodJava);
    }

    public static void main(String[] args) {
        SDET pito=new SDET("Pietro", "Green", 24, true);
        pito.printInfo();


    }
}
