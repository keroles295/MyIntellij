package com.syntax.class29;

import java.util.*;

public class HW3CL29 {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {
        TreeMap<String, String> map=new TreeMap<>();
        map.put("Egypt", "Cairo");
        map.put("USA", "Washington DC");
        map.put("UK", "London");
        map.put("Iraq", "Baghdad");
        map.put("Syria", "Damascus" );
        map.put("Lebanon", "Beirut");
        map.put("palestine", "El-Kodis");
        Collection<Map.Entry<String, String>> collection=map.entrySet();
        for (Map.Entry<String, String> str : collection) {
            System.out.println("Countries = "+str.getKey());
            System.out.println("Capitals = "+str.getValue());
        }
        Iterator<Map.Entry<String, String>>entryIterator= collection.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, String>itor=entryIterator.next();
            System.out.println("Countries With Iterator = "+itor.getKey());
            System.out.println("Capitals With Iterator  = "+itor.getValue());
        }

    }
}
