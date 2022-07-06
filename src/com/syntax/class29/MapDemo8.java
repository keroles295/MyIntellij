package com.syntax.class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo8 {
    public static void main(String[] args) {
        HashMap<String, Double> fruits=new HashMap<>();
        fruits.put("Apple", 20.00);
        fruits.put("Banana", 22.00);
        fruits.put("WaterMellon", 18.00);
        fruits.put("Orange", 38.00);
        fruits.put("Kiwi", 12.0);
        Iterator<Map.Entry<String, Double>> iterator=fruits.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double>en=iterator.next();
            if(en.getKey().contains("e")&& en.getValue()>13.09){
                iterator.remove();
            }
        }
        System.out.println(fruits);


    }
}
