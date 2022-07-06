package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW6CL29 {
    //Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format
    //John Smith=$100000
    public static void main(String[] args) {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(555, "Pito");
        map.put(444, "Kero");
        map.put(9999, "Mariam");
        map.put(222, "Lolo");
        map.put(111, "Gogo");
        Integer maxSalart=0;
        String value="null";
        Collection<Map.Entry<Integer, String>>employee=map.entrySet();
        for (Map.Entry<Integer, String> intEmpl : employee) {
            if (maxSalart < intEmpl.getKey()) {
                maxSalart=intEmpl.getKey();
                value=intEmpl.getValue();
            }
           // System.out.println("maxSalart = " + maxSalart);
        }
        System.out.println(value+"=$"+maxSalart);
    }
}
