package com.syntax.class29;

import java.util.LinkedHashSet;

public class HW7CL29 {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        LinkedHashSet<String>object=new LinkedHashSet<>();
        object.add("Lemon");
        object.add("Kiwi");
        object.add("Apple");
        object.add("Banana");
        object.add("Orange");
        object.add("eggplant");
        String concat="";
        for (String str : object) {
            concat+=str+" / ";
        }
        System.out.println("concat = " + concat);

    }
}
