package com.syntax.class15;

public class HW1401Review {
    //create a method that will take 2 parameters as a numbers and print which number is large
    void printLarger(int num1, int num2){
        int larger=0;
        if(num1>num2){
            larger=num1;
        }else if(num2>num1){
            larger=num2;
        }else{
            larger=num1;
        }
        System.out.println(larger+" is the largert");
    }

    public static void main(String[] args) {
        HW1401Review task1=new HW1401Review();
        task1.printLarger(27, 19);
    }
}
