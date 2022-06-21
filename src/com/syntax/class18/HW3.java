package com.syntax.class18;

public class HW3  {
   //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
   // Method should be available inside the class only where it was declared and executed by calling it is name


    private String getAN(String nim){
        for(int i=0; i<nim.length(); i++ ){
            System.out.println(nim.replaceAll("[^o, a, e, i, u]", ""));
            break;
        }
        return nim;
    }

    public static void main(String[] args) {
        HW3 pito=new HW3();
       pito.getAN("irtiyeoian");

    }




}
