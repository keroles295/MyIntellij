package com.syntax.class20;

public class GrandParent {
    String name="Halim";

}
class Parent extends GrandParent{
    void printInfo(){
        System.out.println("Name of the father is "+name);
    }
}
class Child extends Parent{
    void printInfo(){
        System.out.println("Name of the grand father is "+name);
    }
}
class GrandChild extends Child{
    void printInfo(){
        System.out.println("Name of the grand of the grand father is "+name);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();


    }
}
