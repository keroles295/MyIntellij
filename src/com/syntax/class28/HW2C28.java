package com.syntax.class28;

import java.util.Iterator;
import java.util.TreeSet;

public class HW2C28 {
    public static void main(String[] args) {
        //Create a Set collection in which you need to add names of the countries.
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.
        TreeSet<String>countriesNames=new TreeSet<>();
        countriesNames.add("Egypt");
        countriesNames.add("United States");
        countriesNames.add("Iraq");
        countriesNames.add("Syria");
        countriesNames.add("Lebnan");
        countriesNames.add("China");
        System.out.println(countriesNames);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Iterator<String> iterator= countriesNames.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");

        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for(String contryName:countriesNames){
            System.out.println("contryName = " + contryName);
        }

    }
}
