package com.syntax.class28;

import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<Integer> sortedNumbers=new TreeSet<>();
        sortedNumbers.add(1);
        sortedNumbers.add(12);
        sortedNumbers.add(12);
        sortedNumbers.add(7);
        sortedNumbers.add(67);
        sortedNumbers.add(15);
        System.out.println("sortedNumbers = " + sortedNumbers);
    }
}
