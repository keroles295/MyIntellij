package com.syntax.class15;

public class HW1402Re {
    //create a method will take a number and prints wether is even or odd
    void printEvenOrOdd(int numb){
        if(numb%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        HW1402Re task2=new HW1402Re();
        task2.printEvenOrOdd(21);
    }
}
