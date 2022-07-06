package com.syntax.class28;

import java.util.ArrayList;

public class Task4Wi {
    public static void main(String[] args) {
       //Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Vodka");
        drinks.add("Wine");
        drinks.add("Coffe");
        drinks.add("Milk");
        drinks.add("Whisky");
        for( int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e") ){
                //drinks.remove(i);
                //drinks.add(i, "Water");
                drinks.set(i, "water");//replace

            }
        }
    }
}
