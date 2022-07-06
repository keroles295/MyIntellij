package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Integer>grocery=new TreeMap<>();
        grocery.put("Apple", 2);
        grocery.put("Water Mallon", 7);
        grocery.put("Peach", 12);
        grocery.put("Banana", 3);


        TreeMap<String, Integer>cosmatices=new TreeMap<>();
        cosmatices.put("Foundation", 200);
        cosmatices.put("Primer", 29);
        cosmatices.put("Blush", 78);
        cosmatices.put("Mascara", 79);
        LinkedHashMap<String, Integer> grocries=new LinkedHashMap<>();
        grocries.putAll(grocery);
        grocries.putAll(cosmatices);
        System.out.println(grocries);

    }
}
