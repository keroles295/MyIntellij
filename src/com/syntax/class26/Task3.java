package com.syntax.class26;

import java.util.ArrayList;

public class Task3 {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Pete");
        words.add("Lope");
        words.add("Element");
        words.add("Eye");
        words.add("Yala");
        words.add("Ya Allah");
        words.add("Que");


        for (String words1:words) {
            if(words1.endsWith("e")) {
                words1.replaceAll("", " ");


            }else{
                System.out.print(words1+" ");
            }


        }

    }
}