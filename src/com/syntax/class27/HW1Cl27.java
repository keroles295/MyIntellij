package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class HW1Cl27 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that
        ArrayList<String> names = new ArrayList<>();
        names.add("Kirolys");
        names.add("Ibram");
        names.add("Bishoy");
        names.add("Nazeer");
        names.add("Nabiel");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ibram"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
