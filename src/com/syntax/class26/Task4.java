package com.syntax.class26;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Tequila");
        drinks.add("rum");
        drinks.add("wine");
        drinks.add("whiskey");
        drinks.add("mezcal");
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("e")||drinks.get(i).contains("a")){
                drinks.remove(i);
                drinks.add(i, "water");
            }
        }
        System.out.println(drinks);


    }
}
