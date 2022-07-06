package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.00);
        
        Set<String> keys=fruits.keySet();

        keys.removeIf(s -> s.contains("e"));
        //Iterator<String>iterator= keys.iterator();
//        while (iterator.hasNext()){
//
//            if(iterator.next().contains("e")){
//                iterator.remove();
//            }
//        }
        System.out.println(fruits);
    }
}
