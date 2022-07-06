package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class HW8CL29 {
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers
    public static void main(String[] args) {
        
    
    List<Integer>numbers=new ArrayList<>();
    numbers.add(34);
    numbers.add(12);
    numbers.add(34);
    numbers.add(22);
    numbers.add(12);
    numbers.add(22);
    numbers.add(77);
    numbers.add(77);
    numbers.add(66);
    numbers.add(22);
    numbers.add(66);
    Integer sum=0;
        for (Integer number : numbers) {
            sum+=number;
        }
        System.out.println("sum = " + sum);
    
}
}