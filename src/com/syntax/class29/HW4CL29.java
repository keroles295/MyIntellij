package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HW4CL29 {
    //Create a map of Best Buy store. Place
    //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {
        HashMap<Integer, String>bestBuy=new HashMap<>();
        bestBuy.put(121, "TV");
        bestBuy.put(122, "Printer");
        bestBuy.put(124, "Chargers");
        bestBuy.put(126, "Iphone13");
        bestBuy.put(143, "Vacuum");
        bestBuy.put(135, "Cables");
        Collection<Map.Entry<Integer, String>>bestB=bestBuy.entrySet();
        for (Map.Entry<Integer, String> Keys : bestB) {
            System.out.println("Key = " + Keys.getKey());
        }
    }

}
