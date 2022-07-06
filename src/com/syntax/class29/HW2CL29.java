package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW2CL29 {
    //Create a map of a building.
    // Store floor number and it is associated company name.
    // (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    //Check how many entries you have?
    //Update company on a 4th floor
    //Remove company on the 7th floor
    //Print your map
    public static void main(String[] args) {


        LinkedHashMap<String, String> building = new LinkedHashMap<>();
        building.put("1st", "Google");
        building.put("2st", "Syntax");
        building.put("3st", "Amazon");
        building.put("4st", "M&H");
        building.put("5st", "S&S");
        building.put("6st", "Syntax");
        building.put("7st", "RentalCompany");
        building.put("2st", "S&S");
        System.out.println(building.size());
        building.replace("4st", "M&H");
        building.remove("7st");
        Iterator<Map.Entry<String, String>>mapIter=building.entrySet().iterator();
        while (mapIter.hasNext()){
            Map.Entry<String, String> it=mapIter.next();
            System.out.println(it.getKey()+" "+it.getValue());
        }




    }
}