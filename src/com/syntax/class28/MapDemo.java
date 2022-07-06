package com.syntax.class28;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> groceries=new HashMap<>();
        groceries.put("Eggs", 4);
        groceries.put("Milk", 3);
        groceries.put("Fish", 24);
        groceries.put("Apple", 6);
        groceries.put("Apple", 2);
        System.out.println(groceries.get("Milk"));
        System.out.println(groceries.get("Fish"));


    }
}
