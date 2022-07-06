package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.00);
        Set<Map.Entry<String, Double>> entries =fruits.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println("entry = " + entry);  
        }
    }
}
