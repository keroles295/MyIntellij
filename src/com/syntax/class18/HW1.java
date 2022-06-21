package com.syntax.class18;

import java.io.OptionalDataException;

public class HW1 {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    int [] arr={12, 15, 17, 22, 57};
    int sumOfArr(){
     int sum=0;
        for(int i=0; i<arr.length; i++){
         sum=sum+arr[i];

        }
        return sum;

    }
    public static void main(String[] args) {
        HW1 so= new HW1();
        so.sumOfArr();
        System.out.println(so.sumOfArr());

        //anthor Way
        HW1 so1= new HW1();
        int [] arr1={12, 15, 17, 22, 57};
        System.out.println(so1.sumOfThatArr(arr1));
    }
    int sumOfThatArr(int [] arr1){

        int sum1=0;
        for(int i=0; i<arr1.length; i++){
            sum1=sum1+arr1[i];
        }
        return sum1;
    }



}
