package com.syntax.class23;

public class PolyMorphisDemo1 {
    void doSomthing (String name){
        System.out.println("Downloading a moive from the internet");
    }
    void doSomthing(int num){
        System.out.println("Calculate the text based on new rules");
    }
}
class PolyTest{
    public static void main(String[] args) {
        PolyMorphisDemo1 p=new PolyMorphisDemo1();
        p.doSomthing(10);
        p.doSomthing("Kerto");
    }
}