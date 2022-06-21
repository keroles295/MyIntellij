package com.syntax.class18;

public class HW2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
   public static StringBuilder rev(StringBuilder zam){

       zam.reverse();

        return zam;
    }


    public static void main(String[] args) {
        HW2 s=new HW2();
        StringBuilder niw= s.rev(new StringBuilder("ASDFGH"));
        System.out.println(niw);




    }





}
