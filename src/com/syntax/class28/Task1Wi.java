package com.syntax.class28;

import java.util.ArrayList;

public class Task1Wi {
    public static void main(String[] args) {
        //create an arrylist of 5 names
        ArrayList<String>names= new ArrayList<>(5);//always good to specify initial capacity
        // because it improves the performance
        names.add("Emre");
        names.add("Selda");
        names.add("Sato");
        names.add("Pito");
        names.add("Marritaho");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Selda"));



    }
}
