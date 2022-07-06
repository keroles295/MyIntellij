package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.00);
        Set<String> keys=fruits.keySet();
        for(String key:keys ){
            System.out.println("key = " + key);
        }
        Collection<Double> values =fruits.values();
        for(Double value:values){
            System.out.println("value = " + value);
        }

    }
}
