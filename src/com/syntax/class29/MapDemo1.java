package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.00);
        System.out.println("fruit = " + fruits);
        System.out.println(fruits.get("Kiwi"));
        System.out.println(fruits.remove("Banana"));
        System.out.println(fruits);
        System.out.println(fruits.containsKey("Kiwi"));
        System.out.println(fruits.containsValue(18.00));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.replace("Kiwi", 17.09));
        System.out.println(fruits);







    }
}
