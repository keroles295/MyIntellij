package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.00);
        Collection<Double>values=fruits.values();
        values.removeIf(value-> value>20.9);
        System.out.println(fruits);



    }
}
