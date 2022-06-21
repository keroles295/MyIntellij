package com.syntax.class18;

public class HW6 {
    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.


    protected HW6(int i){
        System.out.println("My bank account number is "+i);
    }
    private HW6(){
        System.out.println("This is my private constructor");

    }
    HW6(double y){
        System.out.println(y+" this was my first pay rate");
    }
    public HW6(String city){
        System.out.println("My city is "+city);
    }

    public static void main(String[] args) {
        HW6 sameClass=new HW6();
    }







}
