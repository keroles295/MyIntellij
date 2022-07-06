package com.syntax.class28;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class HW3C28 {
    public static void main(String[] args) {
        //Create a Set of cities in which you want to make sure that insertion order is maintained.
        // Then remove any city that starts with “A”;
        LinkedHashSet<String> cityName = new LinkedHashSet<>();
        cityName.add("Cairo");
        cityName.add("Alexandria");
        cityName.add("Baghdad");
        cityName.add("Demashik");
        cityName.add("Luxor");
        cityName.add("Aswan");
        System.out.println(cityName);
        Iterator<String> iterator= cityName.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(cityName);

    }


}



